package lesson10.starter;

import lesson10.Convertable;
import lesson10.TemperatureMeasurementSystem;

import java.util.Scanner;

public class TemperatureStarter {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертер. Тут ты сможешь переводить температуру из одной системы в другую.");
        System.out.println("Введи пожалуйста значение для конвертации");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            String inputValue = scanner.next();
            System.out.println("Вместо этого мы ожидали значение температуры как вещественного числа");
        }
        double value = scanner.nextDouble();
        System.out.println("Введи пожалуйста исходную систему измерений (возможные варианты C, K, F)");
        String temperatureSystem = scanner.next();
        System.out.println("Введи пожалуйста систему измерений, в которую будет переведено данное значение (возможные варианты C, K, F)");
        String destinationTemperatureSystem = scanner.next();
        System.out.println("Результат:");
        System.out.println(Convertable.convert(value,
                TemperatureMeasurementSystem.of(temperatureSystem),
                TemperatureMeasurementSystem.of(destinationTemperatureSystem)));
    }
}
