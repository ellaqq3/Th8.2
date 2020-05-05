package com.example.th82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    TextView näkymä;
    TextView teksti;
    BottleDispenser bot = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        näkymä = (TextView) findViewById(R.id.textView);
        teksti = (TextView) findViewById(R.id.pullomaatti);
        teksti.setText("Bottle Dispenser");
    }

    public void AddMoney (View v){
        bot.addMoney();
        näkymä.setText("Money added, 1€");
    }

    public void BuyBottle(View v){
        int num = bot.buyBottle();
        if (num == 11) {
            näkymä.setText("Bottle came out of dispenser");
        }
        else if (num == 0) {
            näkymä.setText("Add more money first");
        }
    }

    public void ReturnMoney(View v){
        float money;
        money = bot.returnMoney();
        String moneyString = new Float(money).toString();

        näkymä.setText("Money came out! You got " + moneyString+ "€ back\n");
    }


}





