package Java_task_19.ex2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент с ФИО "+ name + " не найден!");
    }
}
