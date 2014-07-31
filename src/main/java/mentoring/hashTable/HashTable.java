package mentoring.hashTable;

/**
 * Created by vitaliy.vasilenko on 7/30/2014.
 */

public class HashTable {

    private Node[] table;
    private int size;

    public HashTable(int tableSize) {
        table = new Node[nextPrime(tableSize)];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void makeEmpty() {
        int l = table.length;
        table = new Node[l];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void put(int element) {
        size++;
        int pos = getHashCode(element);
        Node newNode = new Node(element);
        if (table[pos] == null)
            table[pos] = newNode;
        else {
            newNode.next = table[pos];
            table[pos] = newNode;
        }
    }

    public void remove(int element) {
        int position = getHashCode(element);
        Node start = table[position];
        Node end = start;
        if (start.value == element) {
            size--;
            table[position] = start.next;
            return;
        }
        while (end.next != null && end.next.value != element)
            end = end.next;
        if (end.next == null) {
            System.out.println("\nElement not found\n");
            return;
        }
        size--;
        if (end.next.next == null) {
            end.next = null;
            return;
        }
        end.next = end.next.next;
        table[position] = start;
    }

    public int get(int element) {
        int position = getHashCode(element);
        Node start = table[position];
        Node end = start;
        int result = 0;
        if (start.value == element) {
            result = start.value;
            size--;
            table[position] = start.next;
            return result;
        }
        while (end.next != null && end.next.value != element)
            end = end.next;
        if (end.next == null) {
            System.out.println("\nElement not found\n");
            return 0;
        }
        size--;
        if (end.next.next == null) {
            result = end.next.value;
            end.next = null;
            return result;
        }
        end.next = end.next.next;
        result = end.next.value;
        table[position] = start;
        return result;
    }

    private int getHashCode(Integer x) {
        int hashCode = x.hashCode();
        hashCode %= table.length;
        if (hashCode < 0)
            hashCode += table.length;
        return hashCode;
    }

    private static int nextPrime(int n) {
        if (n % 2 == 0)
            n++;
        for (; !isPrime(n); n += 2) ;
        return n;
    }

    private static boolean isPrime(int n) {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
