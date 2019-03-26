package recitation;

/**
 * created by zl on 2019/3/19 18:29
 */
public class binary_tree_withparent
{
    int value;
    binary_tree_withparent left;
    binary_tree_withparent right;
    binary_tree_withparent parent;
    public binary_tree_withparent create(int value)
    {
        binary_tree_withparent node = new binary_tree_withparent();
        node.value = value;
        node.left = null;
        node.right = null;
        node.parent = null;
        return node;
    }
    public binary_tree_withparent connect(binary_tree_withparent root, binary_tree_withparent left, binary_tree_withparent right)
    {
        if(root != null)
        {
            root.left = left;
            root.right = right;
        }
        if(left != null)
            left.parent = root;
        if(right != null)
            right.parent = root;
        return root;
    }
    public void printNode(binary_tree_withparent node)
    {
        if(node != null)
            System.out.println("node="+node.value);
        if(node.left != null)
            System.out.println("left="+node.left.value);
        else
            System.out.println("left=*");
        if (node.right != null)
            System.out.println("right="+node.right.value);
        else
            System.out.println("right=*");
    }
    public void print(binary_tree_withparent node)
    {
        if(node != null)
            printNode(node);
        if(node.left != null)
            print(node.left);
        if(node.right != null)
            print(node.right);
    }
}
