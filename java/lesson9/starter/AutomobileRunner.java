package lesson9.starter;

import lesson9.*;

import java.util.Random;

public class AutomobileRunner {
    public static void main(String[] args) {
        VolvoTruck volvoTruck = new VolvoTruck();
        ManTruck manTruck = new ManTruck();
        Bus bus = new Bus();
        Scania scania = new Scania();
        Snowplow snowplow = new Snowplow();
        Audi audi = new Audi();
        Infiniti infiniti = new Infiniti();
        Lada lada = new Lada();
        LandCruiser landCruiser = new LandCruiser();
        Taxi taxi = new Taxi();

        Automobile[] automobiles = new Automobile[]{volvoTruck, manTruck, bus, scania, snowplow, audi, infiniti, lada, landCruiser, taxi};
        for (Automobile automobile : automobiles ) {
            automobile.move(new Random().nextInt(2000));
        }
    }

}
