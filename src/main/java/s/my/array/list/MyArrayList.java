package s.my.array.list;

public class MyArrayList <T> {
    private T[] data;

    public MyArrayList() {
        data = (T[]) new Object[0];
    }

    public Object get(int index) {
        return data[index];
    }

    public void add(){
    }

    private void expandSize(int size) {

        T[] tmp = data;
        data = (T[]) new Object[size];

        for (int i = 0; i < tmp.length; i++) {
            data[i] = tmp[i];
        }
    }

    public void set(int index, T data) {
        if (0 < index) {
            if (index > this.data.length)
                expandSize(index);
            this.data[index - 1] = data;
        }
    }

    public int size() {
        return data.length;
    }
}