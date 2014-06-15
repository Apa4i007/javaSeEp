package s.my.array.list;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList<String>();
        for (int i = 1; i < 11; i++) {
            list.set(i, "e" + i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
