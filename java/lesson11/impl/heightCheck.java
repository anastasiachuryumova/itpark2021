package lesson11.impl;

import lesson11.Checkable;
import lesson11.CarType;

public class heightCheck implements Checkable{

    @Override
    public double check(CarType speed, CarType carType, CarType registrationNumber,
                        CarType width, CarType height, CarType length, CarType weight) {
        System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                + speed.getSpeed() + width.getWidth() +
                weight.getWeight() + length.getLength() +"не может проехать КПП, так как его высота");
        return height.getHeight();
    }
}
