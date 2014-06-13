package s.third.lesson;

public abstract class AbstractStack<E> implements Stack<E> {
    protected int size;

    public final boolean isEmpty() {
        return size == 0;
    }

    public final int size() {
        return size;
    }

    public E pop() {
        if (size == 0) {
            return null;
        }
        size--;
        return popS();
    }

    protected abstract E popS();
}
