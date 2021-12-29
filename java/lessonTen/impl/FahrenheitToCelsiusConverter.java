package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

public class FahrenheitToCelsiusConverter implements Convertable{

    public static final int DELTA = 32;

    public static final double KOEFFICIENT = 1.8;

    @Override
    public double convert (TemperatureValue value) {
        return (value.getValue() - DELTA) / KOEFFICIENT;
    }
}
