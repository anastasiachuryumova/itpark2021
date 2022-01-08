package lesson9;

public final class VolvoTruck extends Automobile {

    private static final String CAR_CATEGORY = "VolvoTruck";
    private static final int CAR_LIMIT = 1200;

    public VolvoTruck () {
        super (CAR_CATEGORY, CAR_LIMIT);
    }
    @Override
    public void move(int distance) {
        if (distance > limit) {
            System.out.println(this.name + "не может проехать на  одном баке" + distance);
        }
        else {
            System.out.println(this.name + "может проехать на  одном баке" + distance);
        }
    }
}
