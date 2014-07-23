package done.tasks.done.tree.red.black.tree;

public class RedBlackNode {

    RedBlackNode left, right;
    int element;
    int color;

    public RedBlackNode(int theElement)

    {
        this(theElement, null, null);
    }

    public RedBlackNode(int element, RedBlackNode left, RedBlackNode right) {
        this.left = left;
        this.right = right;
        this.element = element;
        this.color = 1;
    }
}
