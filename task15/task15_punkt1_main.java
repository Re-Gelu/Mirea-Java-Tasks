package task15;

import java.util.ArrayList;

public class task15_punkt1_main {


    public static void main(String[] args) {
        ArrayList<Student> task = new ArrayList<>();

        Student robert = new Student("Robert");
        Student omar = new Student("Omar");
        Student philip = new Student("Philip");
        Student test = new Student("TEST");

        task.add(robert);
        task.add(omar);
        task.add(test);

        int position = task.indexOf(omar);
        task.remove(2); //удаляет объект под индексом 2
        System.out.println(task + "\n");
        System.out.println("Размер массива: " + task.size()); //размер массива
        System.out.println("Position Omar: " + position);
        System.out.println(task.get(0)); // хотим узнать имя под индексом 0

        task.add(1, philip); //добавляем philip в индекс 1 с смещением старого
        System.out.println(task + "\n");

        task.clear(); //очищает все элементы массива
        System.out.println(task);





    }
}
