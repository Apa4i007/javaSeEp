package mentoring.binaryHeap;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinaryHeapImplTest {

    public static final int INIT_CAPACITY = 2;

    @Test
    public void testInsert() throws Exception {
        //given
        BinaryHeapImpl binaryHeap = createTestBinaryHeap();

        //when
        binaryHeap.insert(989);

        //then
        assertTrue(!binaryHeap.isEmpty());
        assertTrue(binaryHeap.isFull());
        assertEquals(binaryHeap.delete(1), 989);
        assertEquals(binaryHeap.delete(0), 555);
        assertEquals(binaryHeap.delete(0), 666);
        assertEquals(binaryHeap.delete(0), 999);
        assertTrue(binaryHeap.isEmpty());
    }

    @Test
    public void testDelete() throws Exception {
        //given
        BinaryHeapImpl binaryHeap = createTestBinaryHeap();

        //then
        assertEquals(binaryHeap.delete(1), 999);
    }

    @Test
    public void testDeleteMin() throws Exception {
        //given
        BinaryHeapImpl binaryHeap =createTestBinaryHeap();

        //then
        assertEquals(binaryHeap.deleteMin(), 555);
    }

    @Test
    public void testFindMin() throws Exception {
        //given
        BinaryHeapImpl binaryHeap =createTestBinaryHeap();
        binaryHeap.insert(5);

        //then
        assertEquals(binaryHeap.findMin(), 5);
    }

    private BinaryHeapImpl createTestBinaryHeap() {
        BinaryHeapImpl binaryHeap = new BinaryHeapImpl(INIT_CAPACITY);
        binaryHeap.insert(666);
        binaryHeap.insert(999);
        binaryHeap.insert(555);
        return binaryHeap;
    }
}
