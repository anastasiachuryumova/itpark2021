package lesson10;

import lesson10.enumeration.Currency;
import lesson10.inter.Printable;


public class EnumRunner {
    public static void main(String[] args) {
        Printable printable = new Printer ();
        printable.printTenDollars(Currency.US_DOLLAR);
        printable.printTenDollars(Currency.as(12));

        System.out.println(Currency.US_DOLLAR.asString());
        System.out.println(Currency.US_DOLLAR.asString());
    }
}
