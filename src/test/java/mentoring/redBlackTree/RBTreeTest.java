package mentoring.redBlackTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class RBTreeTest {
    private static final int INITIAL_SIZE = 10;
    private static final int PARENT = 13;
    private static final int NUMBER_OF_NODES = 5;

    @Test
    public void testIsEmpty() throws Exception {
        //given
        RBTree rbt = createTestTree();

        //when
        rbt.makeEmpty();

        //then
        assertTrue(rbt.isEmpty());
    }

    @Test
    public void testMakeEmpty() throws Exception {
        //given
        RBTree rbt = createTestTree();

        //when
        rbt.makeEmpty();

        //then
        assertEquals(rbt.countNodes(), 0);
    }

    @Test
    public void testInsert() throws Exception {
        //given
        RBTree rbt = createTestTree();

        //when
        int item = 12;
        rbt.insert(item);

        //then
        assertTrue(rbt.search(item));
    }

    @Test
    public void testCountNodes() throws Exception {
        //given
        RBTree rbt = createTestTree();

        //then
        assertEquals(rbt.countNodes(), NUMBER_OF_NODES);
    }

    @Test
    public void testSearch() throws Exception {
        //given
        RBTree rbt = createTestTree();

        //then
        assertTrue(rbt.search(PARENT));

    }

    private RBTree createTestTree() {
        RBTree rbt = new RBTree(INITIAL_SIZE);
        rbt.insert(13);
        rbt.insert(8);
        rbt.insert(17);
        rbt.insert(1);
        rbt.insert(11);
        rbt.insert(15);
        rbt.insert(25);
        rbt.insert(6);
        return rbt;
    }
}