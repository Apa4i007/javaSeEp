package s.third.lesson;

public class ArrayStack<E> extends AbstractStack<E> implements Stack<E> {
    private E[] elements;

    public ArrayStack(int capacity) {
        elements = (E[]) (new Object[capacity]);
    }

    @Override
    public E popS() {
        return elements[size];
    }

    @Override
    public void push(E value) {
        increaseCapacity(size + 1);
        elements[size] = value;
        size++;
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return elements[size-1];
    }

    private void increaseCapacity(int capacity) {
        if (elements.length >= capacity) {
            return;
        }
        E[] newElements = (E[]) new Object[2 * capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
