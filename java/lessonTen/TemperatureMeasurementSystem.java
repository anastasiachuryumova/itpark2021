package lessonTen;

public enum TemperatureMeasurementSystem {
    CELSIUS ("C"), KELVIN ("K"), FAHRENHEIT ("K");

    private final String shortName;

    TemperatureMeasurementSystem (String shortName) {

        this.shortName = shortName;
    }
    public static TemperatureMeasurementSystem of (String input) {
        for (TemperatureMeasurementSystem measurementSystem : values()) {
            if (measurementSystem.shortName.equalsIgnoreCase(input)) {
                return measurementSystem;
            }
        }
        return CELSIUS;
    }
}
