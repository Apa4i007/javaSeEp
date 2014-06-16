package done.tasks.done.done;

public interface List<E> {
    void add(E o);
    E set(int index, E o);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
}
