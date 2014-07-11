package done.tasks.done.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testAddNode() throws Exception {
        //given
        BinaryTree theTree = new BinaryTree();

        //when
        theTree.addNode(99,"vetal");

        //then
        assertNotNull(theTree.findNode(99));

    }

    @Test
    public void testInOrderTraverseTree() throws Exception {

    }

    @Test
    public void testPreorderTraverseTree() throws Exception {
    }

    @Test
    public void testPostOrderTraverseTree() throws Exception {

    }

    @Test
    public void testFindNode() throws Exception {
        //given
        BinaryTree binaryTree = createTree();

        //when
        Node node50 = binaryTree.findNode(50);
        Node node85 = binaryTree.findNode(85);

        //then
        assertEquals(node50.toString(),"Boss has the key 50");
        assertEquals(node85.toString(),"Salesman 1 has the key 85");

    }

    private BinaryTree createTree() {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice President");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman 1");
        return theTree;
    }
}