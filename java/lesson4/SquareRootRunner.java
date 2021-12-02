package lesson4;

import java.util.Scanner;

public class SquareRootRunner {
    public static void main(String[] args) {
        double num;
        double half;
        double a;
        double b;

        System.out.println("Программа ищет корень квадратный из числа");
        System.out.println("Введите число");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        half = a / 2;

        do {
            num = half;
            half = (num + (a / num)) / 2;
        }
        while ((num - half) != 0);
        b = half;
        System.out.println("Корень квадратный "+ b);
    }
}
