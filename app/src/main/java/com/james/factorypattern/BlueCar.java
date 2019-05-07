package com.james.factorypattern;

import android.util.Log;

/**
 * Created by 101716 on 2019/5/7.
 */

public class BlueCar implements Car {
    int metal_size, result;

    public BlueCar(int metal){
        metal = metal * 2 + 2;
        result = Math.round(metal); //四捨五入
    }
    @Override
    public Car CreateCar() {
        return new BlueCar(metal_size);
    }

    @Override
    public String getColor() {
        return "Blue Car";
    }

    @Override
    public String getTires() {
        return "4";
    }

    @Override
    public String getWindows() {
        return "2";
    }

    @Override
    public String getAirBags() {
        return "8";
    }

    @Override
    public int getMetal() {
        return result;
    }
}
