package lesson13;

public class Employee {

    private final String name;
    private final int number;
    private final int workAge;

    public Employee (String name, int number, int workAge) {
        this.name = name;
        this.number = number;
        this.workAge = workAge;
    }
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getWorkAge() {
        return workAge;
    }
    @Override
    public String toString() {
        return "ФИО и стаж работы в оргаизации" + number + name + workAge;
    }
}
