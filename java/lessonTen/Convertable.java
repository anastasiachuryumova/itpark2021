package lessonTen;

import lessonTen.impl.CelsiusToFahrenheitConverter;
import lessonTen.impl.CelsiusToKelvinConverter;
import lessonTen.impl.FahrenheitToCelsiusConverter;
import lessonTen.impl.FahrenheitToKelvinConverter;
import lessonTen.impl.IdentityConverter;
import lessonTen.impl.KelvinToCelsiusConverter;
import lessonTen.impl.KelvinToFahrenheitConverter;

public interface Convertable {

    double convert(TemperatureValue value);

    static double convert(TemperatureValue value, TemperatureMeasurementSystem toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelsiusConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToCelsiusConverter().convert(value);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementSystem()) {
                    case KELVIN -> {
                        return new IdentityConverter().convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsiusToKelvinConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvinConverter().convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new CelsiusToFahrenheitConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        switch (value.getMeasurementSystem()) {
                            case CELSIUS -> {
                                return new CelsiusToFahrenheitConverter().convert(value);
                            }
                            case FAHRENHEIT -> {
                                return new IdentityConverter().convert(value);
                            }
                            case KELVIN -> {
                                return new KelvinToFahrenheitConverter().convert(value);
                            }
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("В данный код мы не должны попасть");
    }
    static double convert (double value, TemperatureMeasurementSystem fromSystem,
                           TemperatureMeasurementSystem toSystem) {
        return Convertable.convert(new TemperatureValue(value, fromSystem), toSystem);
    }
}


