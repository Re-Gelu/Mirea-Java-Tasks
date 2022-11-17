package Java_task_19.ex2;

import java.util.Comparator;

public class GroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroupNum() - o2.getGroupNum();
    }
}
