/* Задание на практическую работу №7
  1. Создать абстрактный класс, описывающий посуду(Dish). С помощью наследования реализовать различные виды посуды, имеющие свои свойства и методы. Протестировать работу классов.
  2. Создать абстрактный класс, описывающий собак(Dog). С помощью наследования реализовать различные породы собак. Протестировать работу классов.
  3. Создать абстрактный класс, описывающий мебель. С помощью наследования реализовать различные виды мебели. Также создать класс FurnitureShop, моделирующий магазин мебели. 
  4.Протестировать работу всех классов. */

package Java_task_7;

import java.util.*;

public class task_7 {
    public static void main(String[] args) {

        // Plate class test
        Plate plate = new Plate(4);
        System.out.println(plate);
        plate.set_contained("Обед");
        System.out.println(plate);

        // Teapot class test
        Teapot teapot = new Teapot("black", "plastic", "tea", 2);
        System.out.println(teapot);
        teapot.pour();
        System.out.println(teapot);
        teapot.pour_out();
        System.out.println(teapot);

        // Hound class test
        Hound hound = new Hound("Bobik", 6);
        System.out.println(hound);

        // Furniture and FurnitureShop classes test
        Wardrobe wardrobe = new Wardrobe("plastic", "white");
        System.out.println(wardrobe);
        wardrobe.set_contained("skeleton");
        System.out.println(wardrobe);

        Table table = new Table("wood", "black", "dinner");

        FurnitureShop furniture_shop = new FurnitureShop();
        furniture_shop.add_furniture(wardrobe);
        furniture_shop.add_furniture(table);
        System.out.println(furniture_shop);
    }
}

abstract class Dish {
    protected String material;
    protected String color;
    protected String contains;

    Dish() {
        this.material = "unsetted";
        this.color = "unsetted";
        this.contains = "nothing";
        System.out.println("\n[+] Dish abstract object was created");
    }

    Dish(String material, String color, String contains) {
        this.material = material;
        this.color = color;
        this.contains = contains;
        System.out.println("\n[+] Dish abstract object was created");
    }

    // Dish material getter
    public String get_material() {
        return this.material;
    }

    // Dish material setter
    public void set_material(String material) {
        this.material = material;
    }

    // Dish color getter
    public String get_сolor() {
        return this.color;
    }

    // Dish color setter
    public void set_сolor(String color) {
        this.color = color;
    }

    // Dish contains getter
    public String get_contained() {
        return this.contains;
    }

    // Dish contains setter
    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println("Dish contains now: " + this.contains);
    }

    public String toString() {
        return "Dish object: material: " + this.material + ", color: " + this.color + ", contains: " + this.contains;
    }

}

class Plate extends Dish {
    protected double radius;

    Plate() {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.radius = 1;
        System.out.println("[+] Plate object was created");
    }

    Plate(double radius) {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.radius = radius;
        System.out.println("[+] Plate object was created");
    }

    Plate(double radius, String color, String material, String contains) {
        super.set_сolor(color);
        super.set_material(material);
        super.set_contained(contains);
        this.radius = radius;
        System.out.println("[+] Plate object was created");
    }

    // Radius getter
    double get_radius() {
        return this.radius;
    }

    // Radius setter
    void set_radius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Plate radius setted as: " + this.radius);
        } else {
            System.out.println("Plate radius must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Plate, radius: " + this.radius;
    }
}

class Teapot extends Dish {
    protected double volume;

    Teapot() {
        super.set_сolor("white");
        super.set_material("porcelain");
        super.set_contained("tea");
        this.volume = 0.0;
        System.out.println("[+] Teapot object was created");
    }

    Teapot(String color, String material, String contains, double volume) {
        super.set_сolor(color);
        super.set_material(material);
        super.set_contained(contains);
        this.volume = volume;
        System.out.println("[+] Teapot object was created");
    }

    void pour() {
        this.volume -= 0.2;
        System.out.println("Teapot poured one cup of " + super.get_contained());
    }

    void pour_out() {
        this.volume = 0.0;
        System.out.println("Teapot poured out all " + super.get_contained());
        super.set_contained("nothing");
    }

    // Radius getter
    double get_volume() {
        return this.volume;
    }

    // Radius setter
    void set_volume(double volume) {
        if (volume > 0 && volume < 10) {
            this.volume = volume;
            System.out.println("Teapot volume setted as: " + this.volume);
        } else {
            System.out.println("Teapot volume must be > 0");
        }
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Teapot, volume: " + this.volume;
    }
}

abstract class Dog {
    private String name;
    private int age;

    Dog() {
        this.name = "unsetted";
        this.age = 1;
        System.out.println("\n[+] Dog object with name: " + this.name + " was created");
    }
    // Init
    Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("\n[+] Dog object with name: " + this.name + " was created");
    }

    // Age setter
    public void set_age(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
            System.out.println("Dog age setted as: " + this.age);
        }
    }

    // Age getter
    public int get_age() {
        return this.age;
    }

    // Name setter
    public void set_name(String name) {
        this.name = name;
        System.out.println("Dog name setted as: " + this.name);
    }

    // Name getter
    public String get_name() {
        return this.name;
    }

    // Dog age as human age getter
    public int get_human_age() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog " + this.name + " with age " + this.age;
    }
}

class Hound extends Dog {

    Hound() {
        super.set_name("unsetted");
        super.set_age(1);
        System.out.println("[+] Hound dog object was created");
    }

    Hound(String name, Integer age) {
        super.set_name(name);
        super.set_age(age);
        System.out.println("[+] Hound dog object was created");
    }

    void hunt() {
        System.out.println("Hound dog now hunting");
    }

    void persecute() {
        System.out.println("Hound dog now persecuting someone :)))");
    }

    public String toString() {
        System.out.println(super.toString());
        return "Dog: Hound";
    }
}

abstract class Furniture {
    protected String material;
    protected String color;

    Furniture() {
        this.material = "unsetted";
        this.color = "unsetted";
        System.out.println("\n[+] Furniture abstract object was created");
    }

    Furniture(String material, String color) {
        this.material = material;
        this.color = color;
        System.out.println("\n[+] Furniture abstract object was created");
    }

    // Furniture material getter
    public String get_material() {
        return this.material;
    }

    // Furniture material setter
    public void set_material(String material) {
        this.material = material;
    }

    // Furniture color getter
    public String get_сolor() {
        return this.color;
    }

    // Furniture color setter
    public void set_сolor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Furniture object: material: " + this.material + ", color: " + this.color;
    }
}

class Wardrobe extends Furniture {
    protected String contains;

    Wardrobe() {
        super.set_material("wood");
        super.set_сolor("brown");
        this.contains = "nothing";
        System.out.println("\n[+] Wardrobe object was created");
    }

    Wardrobe(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = "nothing";
        System.out.println("\n[+] Wardrobe object was created");
    }

    Wardrobe(String material, String color, String contains) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = contains;
        System.out.println("\n[+] Wardrobe object was created");
    }

    // Wardrobe contains getter
    public String get_contained() {
        return this.contains;
    }

    // Wardrobe contains setter
    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println("Wardrobe contains now: " + this.contains);
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Wardrobe object: contains: " + this.contains;
    }
}

class Table extends Furniture {
    protected String contains;

    Table() {
        super.set_material("wood");
        super.set_сolor("brown");
        this.contains = "nothing";
        System.out.println("\n[+] Table object was created");
    }

    Table(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = "nothing";
        System.out.println("\n[+] Table object was created");
    }

    Table(String material, String color, String contains) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = contains;
        System.out.println("\n[+] Table object was created");
    }

    // Table contains getter
    public String get_contained() {
        return this.contains;
    }

    // Table contains setter
    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println(this.contains + " on table now");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Table object: on table: " + this.contains;
    }
}

class FurnitureShop {
    private List<Furniture> furniture_shop_array = new ArrayList<Furniture>();

    {
        System.out.println("\n[+] Furniture shop object was created");
    }

    // Add one Furniture
    public void add_furniture(Furniture furniture) {
        this.furniture_shop_array.add(furniture);
        System.out.println(furniture + ". This furniture added into the furniture shop successfully");
    }

    // Add many Furnitures
    public void add_furnitures(Furniture furniture_array[]) {
        this.furniture_shop_array.addAll(new ArrayList<Furniture>(Arrays.asList(furniture_array)));
        System.out.println("Furnitures: " + Arrays.toString(furniture_array) + " added into the furniture shop successfully");
    }

    public String toString() {
        if (!this.furniture_shop_array.isEmpty())
            return "Furniture shop: " + this.furniture_shop_array;
        else
            return "Furniture shop empty!";
    }
}