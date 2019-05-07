package com.james.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarFactory factory = new CarFactory();
        Car redCar = factory.createCarFromColor("RED", 5);
        Car blueCar = factory.createCarFromColor("BLUE", 6);


        Log.d(TAG, "Red Tire " + redCar.getAirBags());
        //Red car Tire 4
        Log.d(TAG, "Blue Tire " + blueCar.getAirBags());
        //Blue Car Tire 8

        Log.d(TAG, "Red metal size : " + redCar.getMetal());
        //Red metal size : 35
        Log.d(TAG, "Blue metal size : " + blueCar.getMetal());
        //Blue metal size : 14
    }
}
