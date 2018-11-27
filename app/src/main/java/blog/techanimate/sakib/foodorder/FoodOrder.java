package blog.techanimate.sakib.foodorder;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.text.DecimalFormat;

public class FoodOrder extends AppCompatActivity {
    TextView tv, tvx, tvs;
    DecimalFormat currency = new DecimalFormat("$###,##.##"); //Currency format
    //For Call
    Button btn, btn1;
    TextView   tv2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);


        Intent intent = getIntent();
        int result = intent.getIntExtra(Menu.FINAL_RESULT, 0);
        String text = intent.getStringExtra(Menu.FINAL_SELECTION);
        float result2 = (float) result;
        float USD = result2 / 80;

        tv2 = (TextView) findViewById(R.id.info);
        tv2.setText("Kindly make sure that you've allowed the permission for making call.\n" + "Make a call or send your address to 5566 for confirming your order.");

        tv = (TextView) findViewById(R.id.tv0);
        tvx = (TextView) findViewById(R.id.tv1);
        tvs = (TextView) findViewById(R.id.tv2);

        tv.setText("You need to pay : " + "" + result + " TAKA");
        tvx.setText("You need to pay: " + "" + currency.format(USD) + " ($1 = 80 TK)");
        tvs.setText(text);

        //for call
        btn = (Button) findViewById(R.id.callb);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number = "5566";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));

                if (ActivityCompat.checkSelfPermission(FoodOrder.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }

        });

        //for sms
        btn1 = (Button) findViewById(R.id.smsb);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.putExtra( "sms body", "");
                sendIntent.setType("vnd.android-dir/mms-sms");
                startActivity(sendIntent);
            }

        });


    }


    }

