package Java_task_19.ex2;

public class Student implements Comparable<Student>{
    private String fio;
    private int avgPoint, groupNum, age;

    public static final AgeComparator AGE_COMP = new AgeComparator();
    public static final AvgComparator AVG_COMP = new AvgComparator();
    public static final GroupComparator GROUP_COMP = new GroupComparator();

    public Student(String fio, int avgPoint, int groupNum, int age) {
        this.fio = fio;
        this.avgPoint = avgPoint;
        this.groupNum = groupNum;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if(fio.equals(""))
            throw new EmptyStringException();
        this.fio = fio;
    }

    public int getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(int avgPoint) {
        this.avgPoint = avgPoint;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", avgPoint=" + avgPoint +
                ", groupNum=" + groupNum +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.fio.compareTo(o.fio);
    }
}
