package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

import static lessonTen.impl.FahrenheitToCelsiusConverter.DELTA;
import static lessonTen.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable{

    @Override
    public double convert (TemperatureValue value) {

        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
