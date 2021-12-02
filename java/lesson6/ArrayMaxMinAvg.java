package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMinAvg {
    public static void main(String[] args) {

        System.out.println("Программа вычисляет максимум, минимум и среднее значение из массива заданной длины");
        System.out.println("Задайте длину массива");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int[] Array = new int[a];
        for (int i = 0; i < Array.length; i++) {
            i = (int) (Math.random() * a);
            System.out.println(i);
            int indexOfMax = a;
            int indexOfMin = a;
                if (Array [i] > Array [indexOfMax]) {
                    indexOfMax = i;
                    System.out.println("Максимальное значение" + "" + indexOfMax);
                }
                else if (Array [i] < Array [indexOfMin]) {
                    indexOfMin = i;
                    System.out.println("Минимальное значение" + "" + indexOfMin);
            }
        }
    }

}


