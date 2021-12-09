package lesson8.starter;

import lesson8.Animal;
import lesson8.Cat;
import lesson8.Cow;
import lesson8.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        Animal[] animals = new Animal[]{cat, dog, cow};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
