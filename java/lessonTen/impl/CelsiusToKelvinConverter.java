package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertable{

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
