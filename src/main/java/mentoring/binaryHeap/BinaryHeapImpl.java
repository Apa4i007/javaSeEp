package mentoring.binaryHeap;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * The shape property: the tree is a complete binary tree; that is, all levels of the tree, except possibly the last one
 * (deepest) are fully filled and if the last level of the tree is not complete, the nodes of that level are filled from
 * left to right.
 * The heap property: each node is greater than or equal to each of its children according to a comparison predicate
 * defined for the data structure.
 */

public class BinaryHeapImpl {
    public static final int NUMBER_OF_CHILDREN = 2;
    public static final String THE_HEAP_IS_EMPTY = "The heap is empty!";

    private int heapSize;
    private int[] heap;

    public BinaryHeapImpl(int capacity) {
        heapSize = 0;
        heap = new int[capacity + 1];
        Arrays.fill(heap, -1);
    }

    public BinaryHeapImpl() {
        heapSize = 0;
        heap = new int[10];
        Arrays.fill(heap, -1);
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean isFull() {
        return heapSize == heap.length;
    }

    public void clear() {
        heapSize = 0;
    }

    private int getParent(int id) {
        return (id - 1) / NUMBER_OF_CHILDREN;
    }

    private int numberOfAllChildren(int id, int k) {
        return NUMBER_OF_CHILDREN * id + k;
    }

    public void insert(int element) {
        if (isFull()) {
            increaseCapacity();
        }
        heap[heapSize++] = element;
        add(heapSize - 1);
    }

    private void increaseCapacity() {
        int[] bufferHeap = new int[heapSize + 1];
        System.arraycopy(heap, 0, bufferHeap, 0, heapSize);
        heap = bufferHeap;
    }

    public int findMin() {
        if (isEmpty())
            throw new NoSuchElementException(THE_HEAP_IS_EMPTY);
        return heap[0];
    }

    public int deleteMin() {
        int minItem = heap[0];
        delete(0);
        return minItem;
    }

    public int delete(int id) {
        if (isEmpty())
            throw new NoSuchElementException(THE_HEAP_IS_EMPTY);
        int keyItem = heap[id];
        heap[id] = heap[heapSize - 1];
        heapSize--;
        remove(id);
        return keyItem;
    }

    private void add(int childId) {
        int buffer = heap[childId];
        while (childId > 0 && buffer < heap[getParent(childId)]) {
            heap[childId] = heap[getParent(childId)];
            childId = getParent(childId);
        }
        heap[childId] = buffer;
    }

    private void remove(int id) {
        int child;
        int buffer = heap[id];
        while (numberOfAllChildren(id, 1) < heapSize) {
            child = getMinChild(id);
            if (heap[child] < buffer)
                heap[id] = heap[child];
            else
                break;
            id = child;
        }
        heap[id] = buffer;
    }


    private int getMinChild(int id) {
        int bestChild = numberOfAllChildren(id, 1);
        int children = 2;
        int pos = numberOfAllChildren(id, children);
        while ((children <= NUMBER_OF_CHILDREN) && (pos < heapSize)) {
            if (heap[pos] < heap[bestChild])
                bestChild = pos;
            pos = numberOfAllChildren(id, children++);
        }
        return bestChild;
    }

    public void printHeap() {
        System.out.print("\nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}

