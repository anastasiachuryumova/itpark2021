package lesson9.starter;

public abstract class Automobile {

    protected final String name;

    public Automobile (String name) {
        this.name = name;
    }

    public abstract void move ();
}
