package mentoring.redBlackTree;

public class RBTree {
    static final int BLACK = 1;
    static final int RED = 0;

    private RedBlackNode current;
    private RedBlackNode parent;
    private RedBlackNode grand;
    private RedBlackNode great;
    private RedBlackNode header;

    private static RedBlackNode nullNode;

    static {
        nullNode = new RedBlackNode(0);
        nullNode.left = nullNode;
        nullNode.right = nullNode;
    }

    public RBTree(int negInf) {
        header = new RedBlackNode(negInf);
        header.left = nullNode;
        header.right = nullNode;
    }

    public boolean isEmpty() {
        return header.right == nullNode;
    }

    public void makeEmpty() {
        header.right = nullNode;
    }

    public void insert(int element) {
        current = parent = grand = header;
        nullNode.element = element;
        while (current.element != element) {
            great = grand;
            grand = parent;
            parent = current;
            current = element < current.element ? current.left : current.right;
            if (current.left.color == RED && current.right.color == RED)
                handleReorient(element);
        }
        if (current != nullNode)
            return;
        current = new RedBlackNode(element, nullNode, nullNode);
        if (element < parent.element)
            parent.left = current;
        else
            parent.right = current;
        handleReorient(element);
    }

    private void handleReorient(int element) {
        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;
        if (parent.color == RED) {
            grand.color = RED;
            if (element < grand.element != element < parent.element)
                parent = rotate(element, grand);
            current = rotate(element, great);
            current.color = BLACK;
        }
        header.right.color = BLACK;
    }

    private RedBlackNode rotate(int element, RedBlackNode parentNode) {
        if (element < parentNode.element)
            return parentNode.left = element < parentNode.left.element ? rotateWithLeftChild(parentNode.left) : rotateWithRightChild(parentNode.left);
        else
            return parentNode.right = element < parentNode.right.element ? rotateWithLeftChild(parentNode.right) : rotateWithRightChild(parentNode.right);
    }

    private RedBlackNode rotateWithLeftChild(RedBlackNode rightNode) {
        RedBlackNode leftNode = rightNode.left;
        rightNode.left = leftNode.right;
        leftNode.right = rightNode;
        return leftNode;
    }

    private RedBlackNode rotateWithRightChild(RedBlackNode leftNode) {
        RedBlackNode rightNode = leftNode.right;
        leftNode.right = rightNode.left;
        rightNode.left = leftNode;
        return rightNode;
    }

    public int countNodes() {
        return countNodes(header.right);
    }

    private int countNodes(RedBlackNode node) {
        if (node == nullNode)
            return 0;
        else {
            int l = 1;
            l += countNodes(node.left);
            l += countNodes(node.right);
            return l;
        }
    }

    public boolean search(int val) {
        return search(header.right, val);
    }

    private boolean search(RedBlackNode node, int searchValue) {
        boolean found = false;
        while ((node != nullNode) && !found) {
            int value = node.element;
            if (searchValue < value)
                node = node.left;
            else if (searchValue > value)
                node = node.right;
            else {
                found = true;
                break;
            }
            found = search(node, searchValue);
        }
        return found;
    }

}

     


