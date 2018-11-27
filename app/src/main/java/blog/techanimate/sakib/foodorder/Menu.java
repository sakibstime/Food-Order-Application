package blog.techanimate.sakib.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;



public class Menu extends AppCompatActivity {
    public static final String FINAL_SELECTION = "blog.techanimate.sakib.foodorder.FINAL_SELECTION";
    public static final String FINAL_RESULT = "blog.techanimate.sakib.foodorder.FINAL_RESULT";

    Button bt;
   int i, price1, price2,price3, price4, price5, price6, price7,price8, price9, price10, price11, price12, price13, price14, price15;
    String items1="" ,items2="", items3="", items4="", items5="",items6="",items7="",items8="",items9="",items10="",items11="",items12="",items13="",items14="",items15="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt = (Button) findViewById(R.id.b1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openfoodorder();

            }


        });
    }



    public void CheckedBox (View view){

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.item1 :
                if (checked) {
                    items1 = "Kacchi Biryani 120 TK\n";
                    price1 = 120;
                }
                else {
                    items1 = "";
                    price1 = 0;

                }
                break;

            case R.id.item2 :
                if  (checked) {
                    items2 = "Bhuna Khichuri 90 TK\n";
                    price2 = 90;
                }
                else {
                    price2 = 0;
                  items2 ="";
                }
                break;
            case R.id.item3 :
                if (checked) {
                    items3 = "Patla Khichuri 80 TK\n";
                    price3 = 80;
                }
                else {

                    items3 ="";
                    price3 = 0;
                }
                break;
            case R.id.item4 :
                if (checked) {
                    items4 = "Morog Polao 120 TK\n";
                    price4 = 120;
                }
                else {
                    price4 = 0;
                   items4 = " ";
                }
                break;
            case R.id.item5 :
                if (checked) {
                    items5 = "Rice with (Vorta,Vaji and Daal) 100TK\n";
                    price5 = 100;
                }
                else {
                    price5 = 0;
                  items5 = "";
                }
                break;
            case R.id.item6 :
                if (checked) {
                    items6 = "Grilled Chicken 70 TK\n";
                    price6 = 70;
                }
                else {
                    price6 = 0;
                    items6 = "";

                }
                    break;
            case R.id.item7 :
                if (checked) {
                    price7 = 60;
                    items7 = "Haleem 60 TK\n";
                }
                else {
                    items7 = "";
                    price7 = 0;
                }
                break;

            case R.id.item8 :
                if (checked) {
                    items8 = "Sheek Kabab 110 TK\n";
                    price8 = 110;
                }
                else {
                    price8 = 0;
                    items8 = "";
                }

                break;
            case R.id.item9 :
                if (checked) {
                    items9 = "Fuchka 80 TK\n";
                    price9 = 80;
                }
                else {
                    price9 = 0;
                    items9 = "";
                }
                break;
            case R.id.item10 :
                if (checked) {
                    items10 = "Misti Doi 50 TK\n";
                    price10 = 50;
                }
                else {
                    price10 = 0;
                    items10 = "";
                }
                break;
            case R.id.item11 :
                if (checked) {
                    items11 = "Doi Chira 70 TK\n";
                    price11 = 70;
                }
                else {
                    items11 = " ";
                    price11 = 0;
                }
                break;
            case R.id.item12 :
                if (checked) {
                    items12 = "Falooda 100 TK\n";
                    price12 = 100;
                }
                else {
                    price12 = 0;
                    items12 = "";
                }
                break;
            case R.id.item13 :
                if (checked) {
                    items13 = "Rashmalai 130 TK\n";
                    price13 = 130;
                }
                else {
                    price13 = 0;
                    items13 = "";
                }
                break;
            case R.id.item14 :
                if (checked) {
                    items14 = "Borhani 90 TK\n";
                    price14 = 90;
                }
                else {
                    items14 = "";
                    price14 = 0;
                }
                break;
            case R.id.item15 :
                if (checked) {
                    items15 = "Lassi 90 TK\n";
                    price15 = 90;
                }
                else {
                    price15 = 0;
                    items15 = "";
                }
                break;
        }


    }

    public void openfoodorder(){
        i = price1+price2+price3+price4+price5+price6+price7+price8+price9+price10+price11+price12+price13+price14+price15;
        String items = items1+items2+items3+items4+items5+items6+items7+items8+items9+items10+items11+items12+items13+items14+items15;

        Intent intent = new Intent(this, FoodOrder.class);
        intent.putExtra(FINAL_RESULT, i);
        intent.putExtra(FINAL_SELECTION, items);
        startActivity(intent);


    }




}
