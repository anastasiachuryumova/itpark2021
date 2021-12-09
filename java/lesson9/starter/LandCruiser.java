package lesson9.starter;

public class LandCruiser extends Automobile {

    public static final String CAR_CATEGORY = "LandCruiser";

    public LandCruiser () {
        super (CAR_CATEGORY);
    }
    @Override
    public void move () {
        System.out.println(this.name + "может проехать на  одном баке 500км");
    }
}
