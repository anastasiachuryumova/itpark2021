package lesson9.starter;

public class Audi extends Automobile {

    public static final String CAR_CATEGORY = "Audi";

    public Audi() {
        super(CAR_CATEGORY);
    }

    @Override
    public void move () {
        System.out.println(this.name + "может проехать на  одном баке 500км");
    }
}

