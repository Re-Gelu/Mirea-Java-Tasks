package Java_task_19.ex2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО", 67, 12, 18));
        s.add(new Student("ФИО2", 57, 12, 18));
        s.add(new Student("ФИО3", 93, 12, 19));
        s.add(new Student("ФИО4", 24, 2, 18));
        s.add(new Student("ФИО5", 66, 12, 18));

        new LabClassUI(s);
    }

}
