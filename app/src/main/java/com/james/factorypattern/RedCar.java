package com.james.factorypattern;

import android.app.Activity;
import android.util.Log;

/**
 * Created by 101716 on 2019/5/7.
 */

public class RedCar implements Car {
    int metal_size;
    int result;
    public RedCar(int metal){
        metal = metal * 5 + 10;
        result = Math.round(metal); //四捨五入
    }

    @Override
    public Car CreateCar() {
        return new RedCar(metal_size);
    }

    @Override
    public String getColor() {
        return "Red car";
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
        return "4";
    }

    @Override
    public int getMetal() {
        return result;
    }

}
