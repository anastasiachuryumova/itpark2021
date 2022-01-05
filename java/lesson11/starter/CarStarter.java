package lesson11.starter;


import lesson11.Checkable;
import lesson11.CarType;

import java.util.Scanner;
public class CarStarter {
    public static void main(String[] args) {
        
        System.out.println("Добро пожаловать на КПП. Здесь мы проверим возможность дальнейшего движения");
        System.out.println("Если у Вас легковой автомобиль, напишите C, если грузовой, напишите T");
        Scanner scanner = new Scanner(System.in);
        String carType = scanner.next();
        System.out.println("Введите номер автомобиля");
        Scanner scanner1 = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
        String registrationNumber = scanner1.next();
            System.out.println("Вместо этого мы ожидали номер автомобиля как вещественное число");
        }
        double registrationNumber = scanner1.nextDouble();
        System.out.println("Введите скорость автомобиля в км/ч");
        Scanner scanner2 = new Scanner(System.in);
        while (!scanner2.hasNextDouble()) {
            String speed = scanner2.next();
            System.out.println("Вместо этого мы ожидали скорость автомобиля как вещественное число");
        }
        double speed = scanner2.nextDouble();
        System.out.println("Введите вес автомобиля в тоннах");
        Scanner scanner3 = new Scanner(System.in);
        while (!scanner3.hasNextDouble()) {
            String weight = scanner3.next();
            System.out.println("Вместо этого мы ожидали вес автомобиля в тоннах как вещественное число");
        }
        double weight = scanner3.nextDouble();
        System.out.println("Введите ширину автомобиля в метрах");
        Scanner scanner4 = new Scanner(System.in);
        while (!scanner4.hasNextDouble()) {
            String width = scanner4.next();
            System.out.println("Вместо этого мы ожидали ширину автомобиля как вещественное число");
        }
        double width = scanner4.nextDouble();
        System.out.println("Введите высоту автомобиля в метрах");
        Scanner scanner5 = new Scanner(System.in);
        while (!scanner5.hasNextDouble()) {
            String height = scanner5.next();
            System.out.println("Вместо этого мы ожидали высоту автомобиля как вещественное число");
        }
        double height = scanner5.nextDouble();
        System.out.println("Введите длину автомобиля в метрах");
        Scanner scanner6 = new Scanner(System.in);
        while (!scanner6.hasNextDouble()) {
            String length = scanner6.next();
            System.out.println("Вместо этого мы ожидали длину автомобиля как вещественное число");
        }
        double length = scanner6.nextDouble();

        System.out.println(Checkable.check(CarType speed, CarType carType, CarType registrationNumber,
                         CarType width, CarType height, CarType length, CarType weight));
    }

}
