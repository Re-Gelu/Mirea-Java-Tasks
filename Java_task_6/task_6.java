/* Задание на практическую работу №6
  1.Создайте в draw.io UML диаграмму, а затем напишите по ней реализацию.
  2.Добавьте в проект ранее разработанный класс прямоугольник (Rectangle). На основе него напишите новый класс MovableRectangle (движущийся прямоугольник). Ваш класс должен реализовывать интерфейс Movable 
  3.Прямоугольник можно также представить как две движущиеся точки MovablePoints (представляющих верхняя левая и нижняя правая точки) и реализующие интерфейс Movable. 
  4.Убедитесь, что две точки имеет одну и ту же скорость (нужно добавить метод, который бы это проверял).  */

package Java_task_6;

public class task_6 {
    
}

abstract class Shape {
    private String color;
    private boolean filled;

    Shape() {
        System.out.println("\n[+] Shape abstract object was created");
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
        return "MovablePoint object - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: "
                + this.ySpeed;
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

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        System.out.println("[+] MovableRectangle object was created");
    }

    public String toString() {
        return "MovableRectangle object - topLeft: " + this.topLeft + ", bottomRight: " + this.bottomRight;
    }

    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
        System.out.println("MovableRectangle object moved up");
    }

    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
        System.out.println("MovableRectangle object moved down");
    }

    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
        System.out.println("MovableRectangle object moved left");
    }

    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
        System.out.println("MovableRectangle object moved right");
    }
}