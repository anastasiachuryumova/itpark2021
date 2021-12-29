package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

import static lessonTen.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsiusConverter implements Convertable {

    @Override
    public double convert (TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
