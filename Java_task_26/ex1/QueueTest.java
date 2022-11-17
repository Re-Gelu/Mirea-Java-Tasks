package Java_task_26.ex1;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        System.out.println(aqm.dequeue());

        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        System.out.println(adt.dequeue());

        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.dequeue());    }
}
