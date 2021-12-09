package lesson10.inter;

public class Checkable {
    boolean check();

    default void print (int index) {
        System.out.println("Совершенно другая валюта");
    }
}
