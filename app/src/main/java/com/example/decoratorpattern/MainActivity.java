package com.example.decoratorpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.decoratorpattern.coffeehouseimpl.condiments.beverages.HouseBlend;
import com.example.decoratorpattern.coffeehouseimpl.condiments.decorators.Mocha;
import com.example.decoratorpattern.coffeehouseimpl.condiments.decorators.Whip;
import com.example.decoratorpattern.coffeehouseimpl.condiments.beverages.Beverage;
import com.example.decoratorpattern.coffeehouseimpl.condiments.beverages.Espresso;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // make an espresso
        Beverage espresso = new Espresso();

        // add mocha, this wraps the Espresso and decorates it with Mocha.
        espresso = new Mocha(espresso);

        //add whip,  this wraps the mocha and decorates it with Whip.
        espresso = new Whip(espresso);

        // prints ->  Beverage => Espresso, Mocha, Whip Cost => 2.45
        Log.i(TAG, "onCreate:  Beverage => " + espresso.getDescr() + " Cost => " + espresso.cost());

        // make House Blend coffee
        Beverage houseBlend = new HouseBlend();

        // add whip to house blend
        houseBlend = new Whip(houseBlend);

        //add mocha to house blend
        houseBlend = new Mocha(houseBlend);

        //prints ->  Beverage => House Blend Coffee, Whip, Mocha Cost => 1.45
        Log.i(TAG, "onCreate: Beverage => " + houseBlend.getDescr() + " Cost => " + houseBlend.cost());

    }
}

