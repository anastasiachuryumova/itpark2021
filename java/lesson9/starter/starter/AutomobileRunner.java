package lesson9.starter.starter;

import lesson9.starter.Automobile;
import lesson9.starter.VolvoTruck;
import lesson9.starter.ManTruck;
import lesson9.starter.Bus;
import lesson9.starter.Scania;
import lesson9.starter.Snowplow;
import lesson9.starter.Audi;
import lesson9.starter.Infiniti;
import lesson9.starter.Lada;
import lesson9.starter.LandCruiser;

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

        Automobile[] automobiles = new Automobile[]{volvoTruck, manTruck, bus, scania, snowplow, audi, infiniti, lada, landCruiser};
        for (Automobile automobile : automobiles) {
            automobile.move();
        }
    }
}
