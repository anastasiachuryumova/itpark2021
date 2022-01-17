package lesson10.impl;

import lesson10.Convertable;
import lesson10.TemperatureValue;

public class FahrenheitToCelsiusConverter implements Convertable{

    public static final int DELTA = 32;

    public static final double KOEFFICIENT = 1.8;

    @Override
    public double convert (TemperatureValue value) {
        return (value.getValue() - DELTA) / KOEFFICIENT;
    }
}
