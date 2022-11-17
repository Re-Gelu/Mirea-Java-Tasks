package Java_task_19.ex2;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Передана пустая строка!");
    }
}
