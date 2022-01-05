package lesson11;


import lesson11.impl.*;

public interface Checkable {


    static double check(CarType speed, CarType carType, CarType registrationNumber,
                        CarType width, CarType height, CarType length, CarType weight) {
        if (speed.getSpeed() > 80) {
            return new speedCheck().check(registrationNumber, speed, weight, width, height, length, carType);
        } else {
            System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                    + speed.getSpeed() + width.getWidth() +
                    weight.getWeight() + length.getLength() + height.getHeight() + "успешно проехал КПП");
        }
        if (speed.getSpeed() > 100) {
            return new anotherSpeedCheck().check(registrationNumber, speed, weight, width, height, length, carType);
        } else {
            System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                    + speed.getSpeed() + width.getWidth() +
                    weight.getWeight() + length.getLength() + height.getHeight() + "успешно проехал КПП");
        }
        if (weight.getWeight() > 8) {
            return new weightCheck().check(registrationNumber, speed, weight, width, height, length, carType);
        } else {
            System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                    + speed.getSpeed() + width.getWidth() +
                    weight.getWeight() + length.getLength() + height.getHeight() + "успешно проехал КПП");
        }
        if (height.getHeight() > 4) {
            return new heightCheck().check(registrationNumber, speed, weight, width, height, length, carType);
        } else {
            System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                    + speed.getSpeed() + width.getWidth() +
                    weight.getWeight() + length.getLength() + height.getHeight() + "успешно проехал КПП");
        }
        if (width.getWidth() > 2.5) {
            return new widthCheck().check(registrationNumber, speed, weight, width, height, length, carType);
        } else {
            System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
                    + speed.getSpeed() + width.getWidth() +
                    weight.getWeight() + length.getLength() + height.getHeight() + "успешно проехал КПП");
        }
        return 0;
    }
    static double check(CarType speed, CarType carType, CarType registrationNumber,
                        CarType width, CarType height, CarType length, CarType weight) {
        return Checkable.check(CarType speed, CarType carType, CarType registrationNumber,
                CarType width, CarType height, CarType length, CarType weight);
    }
}


//    static double check (CarType speed, CarType carType, CarType registrationNumber,
//                         CarType width, CarType height, CarType length, CarType weight) {
//        System.out.println("Ваш автомобиль" + carType.getCarType() + registrationNumber.getRegistrationNumber()
//                + speed.getSpeed() + width.getWidth() +
//                weight.getWeight() + length.getLength() + height.getHeight() + "успешно проехал КПП");;
//    }


