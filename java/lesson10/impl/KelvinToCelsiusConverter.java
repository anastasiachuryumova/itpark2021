package lesson10.impl;

import lesson10.Convertable;
import lesson10.TemperatureValue;

import static lesson10.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsiusConverter implements Convertable {

    @Override
    public double convert (TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
