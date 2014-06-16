package done.tasks.done.done;

public abstract class AbstractList<E> implements List<E> {

    protected int size;

    public final boolean isEmpty() {
        return size == 0;
    }

    public final int size() {
        return size;
    }
}
