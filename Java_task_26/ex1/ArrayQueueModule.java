package Java_task_26.ex1;

package Java_task_26.ex2.AbstractQueue;

// INV: FIFO (First in - first out)
//      0 <= size <= q.length - 1
//      queue[head]..queue[tail] - queue
//      queue - Singleton
//      q.length = 2**x
public class ArrayQueueModule extends AbstractQueue {
    private Object[] q;

    private static ArrayQueueModule instance;

    // PRE: queue - null
    // POST: queue.size = 0;
    //       q.length = 16;
    private ArrayQueueModule(){
        q = new Object[START_CAPACITY];
        head = tail = 0;
    }

    // Pre: none;
    // Post: instance - Singleton;
    //       queue - immutable
    public static ArrayQueueModule getInstance(){
        if(instance == null)
            instance = new ArrayQueueModule();
        return instance;
    }

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    @Override
    public Object dequeue(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        Object r = q[head++];
        if(head == q.length) head = 0;
        if(Math.abs(head-tail) < q.length / 2) resize(q.length / 2);
        return r;
    }

    // PRE:  None
    // POST: queue - immutable
    //       R = (head == tale)
    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    // PRE:  None
    // POST: queue[tail] = element
    //       queue[head]..queue[tail-1] - immutable
    @Override
    public void enqueue(Object element){
        q[tail++] = element;
        if(tail == q.length) tail = 0;
        if(tail == head) resize(q.length * 2);
    }

    // Pre: none;
    // Post: q.length == nSize;
    //       queue - immutable;
    private void resize(int nSize) {
        Object[] nq = new Object[nSize];
        System.arraycopy(q, head, nq, 0, Math.abs(head-tail));
        tail = Math.abs(head-tail);
        head = 0;
        q = nq;
    }

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue - immutable
    @Override
    public Object element(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    // PRE:  None
    // POST: size == 0
    //       q.length = 16
    @Override
    public boolean clear(){
        boolean r = !isEmpty();
        head = tail = 0;
        resize(START_CAPACITY);
        return r;
    }

}
