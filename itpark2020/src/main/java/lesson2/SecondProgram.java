package lesson2;

public class SecondProgram {

    public static void main(String[] args) {

        System.out.println("Закон всемирного тяготения");
        /* F сила гравитации;
        G гравитационная постоянная;
        m1, m2 массы взаимодействующих тел;
        R расстояние между взаимодействующими телами;
         */

            double G = 6.743E-01;
            double m1 = 59722E20;
            double R = 6371302;
            double m2 = 30;

            double result = force (G, m1, m2, R);
            System.out.println("Сила гравитации равна " + result + " H");

        }

    public static double force(double G, double m1, double R, double m2) {
        return G * (( m1 * m2 )/( R * R));

    }

}
