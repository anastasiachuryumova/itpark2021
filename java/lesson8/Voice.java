package lesson8;

public class Voice {
    public static void main(String[] args) {
        public class Animal {
            private String name;
            private int age;

            public Cow (String name, int age) {
                this.name = name;
                this.age = age;
            }
            public void voice () {
                System.out.println(toString() + "Коровы мычат");
            }

            @Override
            public String toString () {
                return "Корова" + name + ", ей" + age + "лет.";
            }
        }

    }
}
