package lesson10.impl;

import lesson10.Convertable;
import lesson10.TemperatureValue;

import static lesson10.impl.FahrenheitToCelsiusConverter.DELTA;
import static lesson10.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable{

    @Override
    public double convert (TemperatureValue value) {

        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
