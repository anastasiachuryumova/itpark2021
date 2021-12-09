package lesson9.starter;

public class VolvoTruck extends Automobile {

    public static final String CAR_CATEGORY = "VolvoTruck";

    public VolvoTruck () {
        super (CAR_CATEGORY);
    }
    @Override
    public void move () {
        System.out.println(this.name + "может проехать на  одном баке 1200км");
    }
}
