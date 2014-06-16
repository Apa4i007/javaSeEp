package done.tasks.done.stack;

public class Main {
    public static void fill(Stack<String> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push("e" + i);
        }
    }
    public static <E> void dump(Stack<E> stack){
        System.out.println(stack.size());
        while (stack.size() !=0){
            System.out.println(stack.peek() + "" + stack.pop());
        }
    }

    public static void main(String[] args) {
        {
            LinkedStack<String> stack = new LinkedStack<String>();
            fill(stack);
            dump(stack);
        }
        {
            ArrayStack<String> stack = new ArrayStack<String>(10);
            fill(stack);
            dump(stack);
        }
    }

}
