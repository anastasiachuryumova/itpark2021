package lesson9.starter;

public class Scania extends Automobile{

    public static final String CAR_CATEGORY = "Scania";

    public Scania () {
        super (CAR_CATEGORY);
    }
    @Override
    public void move () {
        System.out.println(this.name + "может проехать на  одном баке 1200км");
    }
}
