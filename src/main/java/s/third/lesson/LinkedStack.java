package s.third.lesson;

public class LinkedStack<E> extends AbstractStack<E> {
    private Node<E> head;
    @Override
    protected E popS() {
        final E value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public void push(final E element) {
        head = new Node<E>(head, element);
        size ++;
    }

    @Override
    public E peek() {
        if(head == null){
            return null;
        }
        return head.value;
    }

    private static class Node<E> {
        private final E value;
        private final Node<E> next;

        public Node(Node<E> next, E value){
            this.next = next;
            this.value = value;
        }



    }
}
