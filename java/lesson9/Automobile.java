package lesson9;

public abstract class Automobile {

    protected final String name;
    protected final int limit;

    public Automobile(String name, int limit) {
        this.name = name;
        this.limit = limit; }

    public abstract void move(int distance);

}
