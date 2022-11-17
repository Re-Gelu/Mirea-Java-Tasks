package Java_task_26.ex2;

public interface Queue {
    Object dequeue();
    Object element();
    void enqueue(Object o);
    boolean isEmpty();
    boolean clear();
}
