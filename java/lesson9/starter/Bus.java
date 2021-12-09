package lesson9.starter;

public class Bus extends Automobile {

    public static final String CAR_CATEGORY = "Bus";

    public Bus () {
        super(CAR_CATEGORY);
    }

    @Override
    public void move() {
        System.out.println(this.name + "может проехать на  одном баке 1200км");
    }
}
