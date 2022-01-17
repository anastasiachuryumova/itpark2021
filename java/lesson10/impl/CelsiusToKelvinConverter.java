package lesson10.impl;

import lesson10.Convertable;
import lesson10.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertable{

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
