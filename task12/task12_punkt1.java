import java.util.Scanner;

import  static java.lang.Math.*;
public enum  task12_punkt1 {
    MERCURY(3.3, 2440),
    VENUS(48.7, 6052),
    EARTH(59.7, 6357),
    MARS(6.42, 6786),
    JUPITER(19000, 71398),
    SATURN(5690, 60300),
    URANIUM(869, 23800),
    NEPTUNE(1040, 22200);

    private double mass, radius;
    task12_punkt1(double mass, double radius) {
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

    @Override
    public String toString() {
        return "name: " + name() + " {mass: " + mass + ", " + "radius: " + radius + "}";
    }

    public static void main(String[] args) {

        for (task12_punkt1 task : task12_punkt1.values()) {
            System.out.println(task);
        }

    }
}
