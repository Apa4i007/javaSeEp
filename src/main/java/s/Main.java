package s;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("e" + 1);
        s.push("e" + 2);
        s.push("e" + 3);
        System.out.println(s.size());
        while (s.size() != 0) {
            System.out.println(s.peek() + " " + s.pop());
        }
    }
}
