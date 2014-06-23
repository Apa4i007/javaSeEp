package done.tasks.done.done;


public class Main {
    public static void main(String[] args) throws Throwable {
        MyArrayList<String> list =
                new MyArrayList<String>();
        for (int i = 1; i < 10; i++) {
            list.add("e" + i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------");
        for (int i = 0; i < list.size()/2; i++) {
            list.remove(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int x = 10;
        System.out.println(x++ + ++x);
        Object o = new Object();
    }
}
