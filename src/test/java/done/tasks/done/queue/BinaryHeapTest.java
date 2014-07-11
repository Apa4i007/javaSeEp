package done.tasks.done.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryHeapTest {

    @Test
    public void testInsert() throws Exception {
        //given
        BinaryHeap binaryHeap = createHeap();

        //then
        assertTrue(!binaryHeap.isEmpty());
        assertEquals(10,binaryHeap.remove());
    }

    @Test
    public void testRemove() throws Exception {
        //given
        BinaryHeap binaryHeap = createHeap();

        //when
        while (!binaryHeap.isEmpty()) {
            binaryHeap.remove();
        }

        //then
        assertTrue(binaryHeap.isEmpty());
    }

    @Test
    public void testPeekMin() throws Exception {
        //given
        BinaryHeap binaryHeap = createHeap();

        //then
        assertEquals(10,binaryHeap.peekMin());
    }

    @Test
    public void testIsEmpty() throws Exception {
        //given
        BinaryHeap binaryHeap = createHeap();

        //when
        while (!binaryHeap.isEmpty()) {
            binaryHeap.remove();
        }

        //then
        assertTrue(binaryHeap.isEmpty());
    }

    @Test
    public void testIsFull() throws Exception {
        //given
        BinaryHeap binaryHeap = createHeap();

        //then
        assertTrue(binaryHeap.isFull());
    }

    private BinaryHeap createHeap() {
        BinaryHeap thePQ = new BinaryHeap(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        return thePQ;
    }
}