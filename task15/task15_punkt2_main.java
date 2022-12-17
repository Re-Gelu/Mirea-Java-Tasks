package task15_punkt;

import java.util.LinkedList;

public class task15_punkt2_main {
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(1, str3);

        System.out.println(earlBio);
        System.out.println(earlBio.get(0) + "\n");
        earlBio.addFirst(str4); // добавляет элемент в начало списка
        earlBio.addLast(str4); // в конец списка
        System.out.println(earlBio + "\n");
        System.out.println(earlBio.peekFirst());

    }
}
