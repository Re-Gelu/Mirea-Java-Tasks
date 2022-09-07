/* Задание на практическую работу №4
    1.Прочитать UML диаграмму: на диаграмме представлены Абстрактный суперкласс Shape и его подклассы Circle, Rectangle and Square.
    2.Перепишите суперкласс Shape и его подклассы так как это представлено на UML диаграмме Circle, Rectangle and Square  */

package Java_task_4;

public class task_4 {

    public static void main(String[] args) {

        // Circle class test
        Circle circle = new Circle(5.4, "black", true);
        System.out.println(circle);

        // Rectangle class test
        Rectangle rectangle = new Rectangle(5.4 , 4.5);
        System.out.println("Rectanle area: " + rectangle.get_area());
        System.out.println(rectangle);

        // Square class test
        Square square = new Square(10, "white", false);
        square.set_side(11);
        System.out.println(square);
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

class Square extends Rectangle{

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