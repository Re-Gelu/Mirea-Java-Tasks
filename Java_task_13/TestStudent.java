package Java_task_13;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student(12, 4),
                new Student(10, 5),
                new Student(189, 81),
                new Student(2, 320)
        };
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        // Вставки по id
        Student temp;
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j+1] = students[j];
            }
            students[j+1] = current;
        }
        for (Student s : students) {
            System.out.println(s);
        }

        // Быстрая по GPA
        System.out.println();
        qSort(students, students.length-1, 0);
        for (Student s : students) {
            System.out.println(s);
        }

        // merge sort
        System.out.println();
        Student[] students2 = new Student[]{
                new Student(35, 412),
                new Student(16, 105),
                new Student(18, 128),
                new Student(222, 201)
        };
        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    private  static StudentComp comp = new StudentComp();

    public static void qSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }
}


