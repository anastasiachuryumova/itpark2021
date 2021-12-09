package lesson9.starter;

public class Infiniti extends Automobile {

    public static final String CAR_CATEGORY = "Infiniti";

    public Infiniti () {
        super (CAR_CATEGORY);
    }
    @Override
    public void move() {
        System.out.println(this.name + "может проехать на  одном баке 500км");
    }
}
