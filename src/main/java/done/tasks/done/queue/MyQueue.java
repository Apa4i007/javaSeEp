package done.tasks.done.queue;

public class MyQueue<E> {
    private E[] elements;

    private int size;
    private int head;
    private int tail;

    public MyQueue(int size) {
        elements = (E[]) new Object[this.size = size];
    }

    public void add(E value) {
        if (++tail == size)
            tail = 0;
        elements[tail] = value;
    }

    public E extract() {
        if (++head == size)
            head = 0;
        return elements[head];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int size(){
        return size;
    }
}
