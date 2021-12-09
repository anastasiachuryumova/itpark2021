package lesson9.starter;

public class Lada extends Automobile {

    public static final String CAR_CATEGORY = "Lada";

    public Lada () {
        super (CAR_CATEGORY);
    }

    @Override
    public void move () {
        System.out.println (this.name + "может проехать на  одном баке 500км");
    }
}
