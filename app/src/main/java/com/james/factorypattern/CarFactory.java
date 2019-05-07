package com.james.factorypattern;

/**
 * Created by 101716 on 2019/5/7.
 */



public class CarFactory {

    public Car createCarFromColor(String color, int metal_size){
        switch (color){
            case "RED" :
                return new RedCar(metal_size);
            case "BLUE" :
                return new BlueCar(metal_size);
        }
        return null;
    }
}
