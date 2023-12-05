package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private float spongecakes = 10;
    private int spongecakesDiscount = 26;
    private float cream = 14;
    private int creamDiscount = 5;
    private float fruits = 3;
    private int fruitsDiscount = 12;
    private float nuts = 5;
    private int nutsDiscount = 55;
    private float berries = 7;
    private float account =45;

private TextView possibilityOut;
private TextView balanсeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilityOut = findViewById(R.id.possibiltyOut);
        balanсeOut = findViewById(R.id.balanceOut);

        if (possibility()) {
           possibilityOut.setText("имеется достаточно средств для покупки ингредиентов");
           balanсeOut.setText("Остатокот покупки" + balance() + "монет");
        } else {
            possibilityOut.setText("Недостаточно средств для покупки ингредиентов");
            balanсeOut.setText("-");
        }
    }

    private float calclation() {
        float count = (spongecakes * (100-spongecakesDiscount) + cream * (100-creamDiscount) + fruits * (100-fruitsDiscount) + nuts * (100-nutsDiscount)) + berries / 100;
        return count;
    }

    private boolean possib-ility() {
        if (calclation() <= account) {
            return true;
        } else {
            return false;
        }
    }

    private float balance() {
        if(possibility()) {
            return account - calclation();
        } else {
            return -1;
        }
    }

}