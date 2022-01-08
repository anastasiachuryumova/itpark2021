package lesson9;

public final class Scania extends Automobile{

    private static final String CAR_CATEGORY = "Scania";
    private static final int CAR_LIMIT = 1200;

    public Scania () {
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
