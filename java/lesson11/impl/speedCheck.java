package lesson11.impl;

import lesson11.Checkable;
import lesson11.CarType;

public class speedCheck implements Checkable {

    @Override
    public double check (CarType speed, CarType carType, CarType registrationNumber,
                         CarType width, CarType height, CarType length, CarType weight) {
        System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                + speed.getSpeed() + width.getWidth() +
                height.getHeight() + length.getLength() +
                weight.getWeight() + "не может проехать КПП, так как его скорость" );
        return speed.getSpeed();
    }
}
