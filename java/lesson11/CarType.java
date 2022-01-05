package lesson11;

public class CarType {

    private final double registrationNumber;
    private final double speed;
    private final double weight;
    private final double width;
    private final double height;
    private final double length;
    private final CarType carType;

    public CarType ( double registrationNumber, double speed,
                     double weight, double width, double height, double length,
                     CarType carType) {
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
        this.carType = carType;
    }

    public double getRegistrationNumber() {
        return registrationNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public CarType getCarType() {
        return carType;
    }
}
