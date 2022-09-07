/* Задание на практическую работу №5
  Вам нужно написать два класса MovablePoint и MovableCircle - которые реализуют интерфейс Movable на основе классов, разработанных в практической работе № 4. Изучите UML диаграмму и представьте реализацию класса  */

package Java_task_5;

public class task_5 {
    public static void main(String[] args) {
        MovableCircle movable_circle = new MovableCircle(10, 0, 0, 1, 1);
        System.out.println(movable_circle);
        movable_circle.moveUp();
        movable_circle.moveUp();
        movable_circle.moveRight();
        System.out.println(movable_circle);
        movable_circle.moveDown();
        movable_circle.moveDown();
        movable_circle.moveDown();
        movable_circle.moveDown();
        System.out.println(movable_circle);
    }
}

abstract class Shape {
    private String color;
    private boolean filled;

    Shape() {
        System.out.println("\n[+] Shape object was created");
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("\n[+] Shape object was created");
    }

    // Color getter
    String get_color() {
        return this.color;
    }

    // Color setter
    void set_color(String color) {
        this.color = color;
        System.out.println("Shape color setted as: " + this.color);
    }

    // Filled getter
    boolean is_filled() {
        return this.filled;
    }

    // Filled getter
    void set_filled(boolean filled) {
        this.filled = filled;
        System.out.println("Shape filledness setted as: " + this.filled);
    }

    // Area getter
    double get_area() {
        return 0.0;
    }

    // Perimetr getter
    double get_perimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape object: is filled: " + this.filled + ", color: " + this.color;
    }
}

class Circle extends Shape {
    protected double radius;

    Circle() {
        super.set_color("blue");
        super.set_filled(false);
        this.radius = 1;
        System.out.println("[+] Circle object was created");
    }

    Circle(double radius) {
        super.set_color("blue");
        super.set_filled(false);
        this.radius = radius;
        System.out.println("[+] Circle object was created");
    }

    Circle(double radius, String color, boolean filled) {
        super.set_color(color);
        super.set_filled(filled);
        this.radius = radius;
        System.out.println("[+] Circle object was created");
    }

    // Radius getter
    double get_radius() {
        return this.radius;
    }

    // Radius setter
    void set_radius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Circle radius setted as: " + this.radius);
        } else {
            System.out.println("Circle radius must be > 0");
        }
    }

    @Override
    double get_area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double get_perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle, radius: " + this.radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        super.set_color("blue");
        super.set_filled(false);
        System.out.println("[+] Rectangle object was created");
    }

    Rectangle(double width, double length) {
        super.set_color("blue");
        super.set_filled(false);
        this.width = width;
        this.length = length;
        System.out.println("[+] Rectangle object was created");
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super.set_color("blue");
        super.set_filled(false);
        this.width = width;
        this.length = length;
        System.out.println("[+] Rectangle object was created");
    }

    // Width getter
    double get_width() {
        return this.width;
    }

    // Width setter
    void set_width(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Rectangle width setted as: " + this.width);
        } else {
            System.out.println("Rectangle width must be > 0");
        }
    }

    // Length getter
    double get_length() {
        return this.length;
    }

    // Width setter
    void set_length(double length) {
        if (length > 0) {
            this.length = length;
            System.out.println("Rectangle length setted as: " + this.length);
        } else {
            System.out.println("Rectangle length must be > 0");
        }
    }

    @Override
    double get_area() {
        return this.length * this.width;
    }

    @Override
    double get_perimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width;
    }
}

class Square extends Rectangle {

    Square() {
        super.set_color("blue");
        super.set_filled(false);
        System.out.println("[+] Square object was created");
    }

    Square(double side) {
        super.set_color("blue");
        super.set_filled(false);
        this.width = side;
        this.length = side;
        System.out.println("[+] Square object was created");
    }

    Square(double side, String color, boolean filled) {
        super.set_color("blue");
        super.set_filled(false);
        this.width = side;
        this.length = side;
        System.out.println("[+] Square object was created");
    }

    // Side getter
    double get_side() {
        return this.width;
    }

    // Side setter
    void set_side(double side) {
        if (side > 0) {
            this.width = side;
            this.length = side;
            System.out.println("Square side setted as: " + this.width);
        } else {
            System.out.println("Square side must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: square, side: " + this.width;
    }
}

interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("\n[+] MovablePoint object was created");
    }

    public String toString() {
        return "MovablePoint object - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("MovablePoint object moved up by " + this.ySpeed);
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("MovablePoint object moved down by " + this.ySpeed);
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("MovablePoint object moved left by " + this.xSpeed);
    }
    
    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("MovablePoint object moved right by " + this.xSpeed);
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        System.out.println("[+] MovableCircle object was created");
    }

    public String toString() {
        return "MovableCircle object - radius: " + this.radius + ", center: " + center;
    }

    public void moveUp() {
        this.center.moveUp();
        System.out.println("MovableCircle object moved up");
    }

    public void moveDown() {
        this.center.moveDown();
        System.out.println("MovableCircle object moved down");
    }

    public void moveLeft() {
        this.center.moveLeft();
        System.out.println("MovableCircle object moved left");
    }

    public void moveRight() {
        this.center.moveRight();
        System.out.println("MovableCircle object moved right");
    }
}