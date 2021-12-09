package lesson10.inter;

import lesson10.enumeration.Currency;

public class Printable {
    int INDEX = 1;
    void print();

    static void print (String str) {
        System.out.println(str);
    }

    default void print (int index) {
        print("");
    }

    default void printTenDollars (Currency currency) {
        switch (currency) {
            case US_DOLLAR -> System.out.println("Ten Dollars");
            case EURO -> System.out.println("Eight Euro eighty-three");
            case ROUBLE -> System.out.println("Seven hundred and thirty-eight Roubles");
        }
    }
}
