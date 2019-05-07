package com.james.factorypattern;

/**
 * Created by 101716 on 2019/5/7.
 */

public interface Car {
    Car CreateCar();
    String getColor();
    String getTires();
    String getWindows();
    String getAirBags();
    int getMetal();
}
