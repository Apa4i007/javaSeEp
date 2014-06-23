package done.tasks.done.done;

public class MyArrayList <E> extends AbstractList<E> {

    private E[] elements;

    public MyArrayList() {
        elements = (E[]) (new Object[0]);
    }

    @Override
    public void add(E value) {
        increaseCapacity(size + 1);
        elements[size] = value;
        size++;
    }

    @Override
    public E set(int index, E value) {
        rangeCheck(index);
        E oldValue = elements[index];
        elements[index] = value;
        return oldValue;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index+1, elements, index,
                    numMoved);
        elements[--size] = null;
        return oldValue;
    }

    private void increaseCapacity(int capacity) {
        if (checkRangeForIncrease(capacity)) return;
        E[] newElements = (E[]) new Object[2 * capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    private boolean checkRangeForIncrease(int capacity) {
        return elements.length >= capacity;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }
}