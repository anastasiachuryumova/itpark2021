package lesson11.starter;

import lesson11.Car;
import lesson11.Truck;
import lesson11.Vehicle;

import java.util.Random;

public class CarRunner {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать на КПП. Система проверит Ваши параметры и сообщит о возможности проезда");

        Car car = new Car();
        Truck truck = new Truck();


        Vehicle[] vehicles = new Vehicle[]{car, truck};
        for (Vehicle vehicle : vehicles) {
            vehicle.speedCheck(new Random().nextInt(200));
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.anotherSpeedCheck(new Random().nextInt(200));
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.weightCheck(new Random().nextInt(12));
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.heightCheck(new Random().nextInt(5));
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.widthCheck(new Random().nextInt(3));
        }
    }
}
