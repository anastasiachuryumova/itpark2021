package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculate {
    public static void main(String[] args) {
        System.out.println("Добрый день, укажите длину массива как целое число");
        int arrayLength = getArrayLength ();
        int [] array = fillArray (arrayLength);
        System.out.println(Arrays.toString(array));
        int max = getMax(array);
        System.out.println("Максимум в массиве:" + max);
        int max2 = getAnotherMax(array);
        System.out.println("Максимум в массиве (другой способ)" +max2);
        int min = getMin (array);
        System.out.println("Минимум в массиве:" + min);
        double avg = getAvg (array);
        System.out.println("Среднее арифметическое в массиве" + avg);

    }

    private static double getAvg(int[] array) {
        double avg = 0;
        for (int digit: array) {
            avg +=digit;
        }
        avg /= array.length;
        return avg;
    }

    private static int getMin(int[] array) {
        int min = array [array.length - 1];
        if (array.length > 1) {
            for (int index = array.length - 2; index >=0; index --) {
                int digit = array [index];
                if (digit < min) {
                    min = digit;
                }
            }
        }
        return min;
    }

    private static int getAnotherMax(int[] array) {
        int max = array [0];
        for (int digit :array) {
            max = Math.max(max, digit);
        }
        return max;
    }

    private static int getMax(int[] array) {
        int max = array [0];
        for (int digit : array) {
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }

    private static int[] fillArray(int arrayLength) {
        int [] digits = new int [arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            digits [index] = Math.round((float) Math.random() * 1000);
        }
        return digits;
    }

    private static int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Простите, но ввод значения подразумевает целое число");
            scanner.next();
        }
        int length = scanner.nextInt();
        if (length <=0) {
            System.out.println("Вы указали отрицательное значение, что недопустимо в программе");
            return getArrayLength();
        }
        return length;
    }
}
