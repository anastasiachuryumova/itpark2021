package lessonEleven;


public class Car extends Vehicle {

    private static String CAR_TYPE = "Легковой автомобиль";
    private static String REGISTRATION_NUMBER = "С645ВУ799";

    public Car() {
        super(CAR_TYPE, REGISTRATION_NUMBER);
    }

   @Override
   public void speedCheck (int speed) {
       if (speed > 80 & speed < 100) {
           System.out.println(CAR_TYPE + " " + REGISTRATION_NUMBER);
           System.out.println("Внимание! Ваша скорость " + speed + " больше допустимой, допустимая скорость 80км/ч");
       }
   }
    public void anotherSpeedCheck (int speed) {
       if (speed > 100) {
           System.out.println(CAR_TYPE + " " + REGISTRATION_NUMBER);
           System.out.println("Внимание! Ваша скорость " + speed + " больше допустимой более чем на 20 км/ч. " +
                   "Ваш регистрационный номер передан в ГИБДД");
       }
    }
    public void weightCheck (int weight) {
       if (weight > 8) {
           System.out.println(CAR_TYPE + " " + REGISTRATION_NUMBER);
           System.out.println("Внимание! Вес Вашего автомобиля " + weight + " более допустимого. Допустимый вес 8 тонн");
       }
    }
    public void heightCheck(int height) {
       if (height > 4) {
           System.out.println(CAR_TYPE + " " + REGISTRATION_NUMBER);
           System.out.println("Внимание! Высота Вашего автомобиля " + height + " более допустимой. Допустимая высота 4 м");
       }
    }
    public void widthCheck(int width) {
       if (width > 2.5) {
           System.out.println(CAR_TYPE + " " + REGISTRATION_NUMBER);
           System.out.println("Внимание! Ширина Вашего автомобиля " + width + " более допустимой. Допустимая ширина 2.5 м");
       }
    }
    public void check(int speed, int weight, int height, int width) {
        if (speed < 80 & weight < 8 & height < 4 & width <2.5) {
            System.out.println("Вы можете проехать КПП.");
        }
    }
}
