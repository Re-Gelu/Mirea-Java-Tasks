/* Задание на практическую работу №2 
1.Необходимо реализовать простейший класс Shape (Фигура) на языке программирования Java. 
    Добавить метод toString(). Создать класс-тестер для вывода информации об объекте.
2. Реализуйте простейший класс «Мяч»
3. Реализуйте простейший класс «Книга» 
4. Разработайте и реализуйте класс Dog (Собака), поля класса описывают кличку и возраст собаки. Необходимо выполнить следующие действия: 
    определить конструктор собаки, чтобы принять и инициализировать данные экземпляра., включить стандартные методы  (аксессоры) для получения и установки 
    для имени и возраста, включить метод для перевода возраста собаки в "человеческий " возраст (возраст семь раз собаки), включите метод ToString, 
    который возвращает описание экземпляра собаки в виде строки. Создание класса тестера под названием ПитомникСобак, реализует массив собак и 
    основной метод этого класса позволяет добавить в него несколько объектов собаки. */

package Java_task_2;

import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        // Shape class test
        Shape Triangle = new Shape("triangle");
        System.out.println("toString() method test: " + Triangle.toString());

        // Ball and book classes test
        Ball ball = new Ball(4);
        ball.display_info();

        Book book = new Book("MeinKampf", 900);
        book.display_info();

        // Dog class test
        Dog bobik = new Dog("Bobik", 5);
        bobik.set_age(6);
        System.out.println(bobik);

        Dog dogs[] = { new Dog("Sharik", 9), new Dog("Андрей", 18), new Dog("Shushara", 3) };
    
        // Dog kennel test
        Dog_kennel dog_kennel = new Dog_kennel();
        System.out.println(dog_kennel);

        dog_kennel.add_dog(bobik);
        System.out.println(dog_kennel);

        dog_kennel.add_dogs(dogs);
        System.out.println(dog_kennel);
    }
}

class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
        System.out.println("\n[+] Shape object " + this.name + " was created");
    }

    public String toString() {
        return "Shape: " + this.name;
    }
}

class Dog {
    private String name;
    private int age;
    
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

class Dog_kennel {
    private List<Dog> dog_kennel_array = new ArrayList<Dog>();

    {
        System.out.println("\n[+] Dog kennel object was created");
    }

    // Add one dog 
    public void add_dog(Dog dog) {
        this.dog_kennel_array.add(dog);
        System.out.println(dog + ". This dog added into the dog kennel successfully");
    }

    // Add many dogs
    public void add_dogs(Dog dogs[]) {
        //this.dog_kennel_array = Stream.concat(Arrays.stream(this.dog_kennel_array.toArray()), Arrays.stream(dogs)).toArray(Dog[]::new);
        this.dog_kennel_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added into the dog kennel successfully");
    }

    public String toString() {
        if (!this.dog_kennel_array.isEmpty()) return "Dog kennel: " + this.dog_kennel_array;
        else return "Dog kennel empty!";
    }
}

class Ball {
    int radius;
    int diametr;

    Ball(int radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("\n[+] Ball object was created");
    }

    void display_info() {
        System.out.printf("Radius: %s \tDiametr: %d\n", this.radius, this.diametr);
    }
}

class Book {
    String name;
    int pages;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        System.out.println("\n[+] Book object was created");
    }

    void display_info() {
        System.out.printf("Book name: %s \tPages: %d\n", this.name, this.pages);
    }
}