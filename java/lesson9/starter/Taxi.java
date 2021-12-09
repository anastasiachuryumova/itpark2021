package lesson9.starter;

public class Taxi extends Automobile {
    public static final String CAR_CATEGORY = "Taxi";

    public Taxi () {
        super (CAR_CATEGORY);
    }

    @Override
    public void move() {
        System.out.println(this.name + "может проехать на  одном баке 500км");
    }
}
