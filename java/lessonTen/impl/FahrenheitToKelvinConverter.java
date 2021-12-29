package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

public class FahrenheitToKelvinConverter implements Convertable {
    @Override
    public double convert (TemperatureValue value) {
        return (value.getValue() - FahrenheitToCelsiusConverter.DELTA) / FahrenheitToCelsiusConverter.KOEFFICIENT + CelsiusToKelvinConverter.DELTA;
    }
}
