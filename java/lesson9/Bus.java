package lesson9;

public final class Bus extends Automobile {

    private static final String CAR_CATEGORY = "Bus";
    private static final int CAR_LIMIT = 1200;

    public Bus() {
        super(CAR_CATEGORY, CAR_LIMIT);
    }

    @Override
    public void move(int distance) {
        if (distance > limit) {
            System.out.println(this.name + "не может проехать на  одном баке" + distance);
        } else {
            System.out.println(this.name + "может проехать на  одном баке" + distance);
        }
    }
}