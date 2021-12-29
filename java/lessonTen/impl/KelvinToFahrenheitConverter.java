package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertable{

    @Override
    public double convert (TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT + FahrenheitToCelsiusConverter.DELTA;
    }
}
