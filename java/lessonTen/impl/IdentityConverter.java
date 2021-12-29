package lessonTen.impl;

import lessonTen.Convertable;
import lessonTen.TemperatureValue;

public class IdentityConverter implements Convertable{

    @Override
    public double convert (TemperatureValue value) {
        return value.getValue();
    }
}
