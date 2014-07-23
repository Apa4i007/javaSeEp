package done.tasks.done.tree.red.black.tree;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class RBTreeTest {
    private static final int NUMBER_OF_NODES = 8;
    private static final int PARENT = 13;
    RBTree rbt = new RBTree(Integer.MIN_VALUE);

    @After
    public void after(){
        rbt.makeEmpty();
    }

    @org.junit.Test
    public void testIsEmpty() throws Exception {
        //given
        createTestTree();

        //when
        rbt.makeEmpty();

        //then
        assertTrue(rbt.isEmpty());
    }

    @Test
    public void testMakeEmpty() throws Exception {
        //when
        createTestTree();
        rbt.makeEmpty();

        //then
        assertEquals(rbt.countNodes(), 0);
    }

    @Test
    public void testInsert() throws Exception {
        //when
        int item = 12;
        rbt.insert(item);

        //then
        assertTrue(rbt.search(item));
    }

    @Test
    public void testCountNodes() throws Exception {
        //given
        createTestTree();

        //then
        assertEquals(rbt.countNodes(), NUMBER_OF_NODES);
    }

    @Test
    public void testSearch() throws Exception {
        //given
        createTestTree();

        //then
        assertTrue(rbt.search(PARENT));

    }

    private void createTestTree() {
        rbt.insert(13);
        rbt.insert(8);
        rbt.insert(17);
        rbt.insert(1);
        rbt.insert(11);
        rbt.insert(15);
        rbt.insert(25);
        rbt.insert(6);
        assertEquals(rbt.countNodes(),NUMBER_OF_NODES);
    }
}