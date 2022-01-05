package lesson11.impl;

import lesson11.CarType;
import lesson11.Checkable;

public class anotherSpeedCheck implements Checkable {

    @Override
    public double check (CarType speed, CarType carType, CarType registrationNumber,
                         CarType width, CarType height, CarType length, CarType weight) {
        System.out.println("Данные о вашем автомобиле" + carType.getCarType() +
                registrationNumber.getRegistrationNumber() + width.getWidth() +
                height.getHeight() + length.getLength() +
                weight.getWeight() + "переданы в ГИБДД, так как его скорость");
        return speed.getSpeed();
    }
}
