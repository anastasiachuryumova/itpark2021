package lesson5;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        int a;
        System.out.println("Программа вычисляет n-ый член последовательности Фибоначчи");
        System.out.println("Напишите номер числа в последовательности Фибоначчи");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 0) {
            System.out.println("0");
        }
        int f [] = new int [n];
        f [0] = 0;
        f [1] = 1;
        for (int i = 2; i < n; i++) {
            f [i] = f [i-1] + f [i-2];
            a = f [i] ;
            System.out.println("n-ый член последовательности" + " " + a);
        }
    }

}