package lesson10.inter;

import lesson10.inter.Checkable;
import lesson10.inter.Printable;

public interface PrintableAndCheckable extends Printable, Checkable {

        void otherPrint ();

        default void print (int index) {
            Checkable.super.print(index);
            Printable.super.print(index);
        }
    }


