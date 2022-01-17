package lesson10.impl;

import lesson10.Convertable;
import lesson10.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertable{

    @Override
    public double convert (TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT + FahrenheitToCelsiusConverter.DELTA;
    }
}
