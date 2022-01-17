package lesson10.impl;

import lesson10.Convertable;
import lesson10.TemperatureValue;

public class FahrenheitToKelvinConverter implements Convertable {
    @Override
    public double convert (TemperatureValue value) {
        return (value.getValue() - FahrenheitToCelsiusConverter.DELTA) / FahrenheitToCelsiusConverter.KOEFFICIENT + CelsiusToKelvinConverter.DELTA;
    }
}
