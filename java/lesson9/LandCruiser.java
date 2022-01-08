package lesson9;

public final class LandCruiser extends Automobile {

    private static final String CAR_CATEGORY = "LandCruiser";
    private static final int CAR_LIMIT = 500;

    public LandCruiser () {
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
