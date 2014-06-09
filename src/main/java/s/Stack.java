package s;

public class Stack {

    private Object[] elements = new Object[0];
    private int size;

    public int size() {
        return size;
    }

    public void push(Object value) {
        increaseCapacity(size + 1);
        elements[size++] = value;
    }

    private void increaseCapacity(int capacity) {
        if (elements.length >= capacity) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public Object pop() {
        if (size == 0) {
            return null;
        }
        return elements[--size];
    }

    public Object peek() {
        return elements[size - 1];
    }
}
