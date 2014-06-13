package s.third.lesson;

public interface Stack<E> {
    void push(E o);
    E pop();
    E peek();
    int size();
    boolean isEmpty();
}
