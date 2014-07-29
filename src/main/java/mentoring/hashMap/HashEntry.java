package mentoring.hashMap;

/**
 * Created by vitaliy.vasilenko on 7/29/2014.
 */
public class HashEntry {
    int value;
    int key;

    public HashEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
