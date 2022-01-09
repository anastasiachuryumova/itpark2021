package lessonEleven;

public abstract class Vehicle {

    protected String carType;
    protected String registrationNumber;


    public Vehicle(String carType, String registrationNumber) {
        this.carType = carType;
        this.registrationNumber = registrationNumber;

    }

    public abstract void speedCheck(int speed);

    public abstract void anotherSpeedCheck(int speed);

    public abstract void weightCheck(int weight);

    public abstract void heightCheck(int height);

    public abstract void widthCheck(int width);


}

