package lesson7;

public static void main (String[] args){

public class CreateClasses {
    public class Animals {
        String name;
        int age;
        String color;
        String breed;
        boolean male;
        double weight;


        public void Run(int ObstacleLength) {
            this.ObstacleLength = ObstacleLength;
        }

        public void Swim(int ObstacleLength) {
            this.ObstacleLength = ObstacleLength;
        }

        public Dog () {
            this.name = name;
            this.age = age;
            this.color = color;
            this.breed = breed;
            this.male = false;
            this.weight = weight;

            Animals Dog = new Dog();
            Dog.name = "Rex";
            Dog.age = 3;
            Dog.color = "black";
            Dog.breed = "Labrador";
            Dog.male = true;
            Dog.weight = 12;
            Dog.Run(500);
            System.out.println("Собака пробежала 500 метров");
            Dog.Swim(10);
            System.out.println("Собака проплыла 10 метров");
        }


        public HouseCat() {
            this.name = name;
            this.age = age;
            this.color = color;
            this.breed = breed;
            this.male = false;
            this.weight = weight;

            Animals Cat = new Cat();
            Cat.name = "MrsPurr";
            Cat.age = 3;
            Cat.color = "champaign";
            Cat.breed = "ScottishFold";
            Cat.male = false;
            Cat.weight = 5;
            Cat.Run(200);
            System.out.println("Кот пробежал 200 метров");
            Cat.Swim(0);
            System.out.println("Кот не умеет плавать");
        }

        public Tiger(String name;int age;String color;String breed;boolean male;double weight;) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.breed = breed;
            this.male = false;
            this.weight = weight;

            Animals Tiger = new Tiger("Unknown", "Unknown", "полосатый тигр", "полосатый тигр", "Unknown", "Unknown");

        }
    }
}

