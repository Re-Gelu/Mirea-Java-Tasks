import java.util.Scanner;
import static java.lang.Math.*;

public enum task12_punkt2 {

    MERCURY(3.3, 2440),
    VENUS(48.7, 6052),
    EARTH(59.7, 6357),
    MARS(6.42, 6786),
    JUPITER(19000, 71398),
    SATURN(5690, 60300),
    URANIUM(869, 23800),
    NEPTUNE(1040, 22200);

    private double mass, radius;
    task12_punkt2(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getMass() {
        return mass;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getGravity() {
        return 6.67 * (mass * (pow(10, 6))) / (pow(radius, 2));
    }


    @Override
    public String toString() {

        return "name: " + name() + " {Gravity: " + getGravity() + " }";
    }

    public static void main(String[] args) {

        System.out.println("Выберите действие: ");
        System.out.println("1. Узнать силу притяжения планеты MARS");
        System.out.println("2. Узнать силу притяжения планеты VENUS");
        System.out.println("3. Узнать силу притяжения планеты MERCURY");
        System.out.println("4. Узнать силу притяжения планеты EARTH");
        System.out.println("5. Узнать силу притяжения планеты JUPITER");
        System.out.println("6. Узнать силу притяжения планеты SATURN");
        System.out.println("7. Узнать силу притяжения планеты URANIUM");
        System.out.println("8. Узнать силу притяжения планеты NEPTUNE");
        System.out.println("\n");
        task12_punkt2 task;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int action = r;
        switch (action) {
            case 1:
                task = task12_punkt2.MARS;
                System.out.println(task);
                break;
            case 2:
                task = task12_punkt2.VENUS;
                System.out.println(task);
                break;
            case 3:
                task = task12_punkt2.MERCURY;
                System.out.println(task);
                break;
            case 4:
                task = task12_punkt2.EARTH;
                System.out.println(task);
                break;
            case 5:
                task = task12_punkt2.JUPITER;
                System.out.println(task);
                break;
            case 6:
                task = task12_punkt2.SATURN;
                System.out.println(task);
                break;
            case 7:
                task = task12_punkt2.URANIUM;
                System.out.println(task);
                break;
            case 8:
                task = task12_punkt2.NEPTUNE;
                System.out.println(task);
                break;
            default: System.out.println("Такого варианта нет!");
        }

    }

}
