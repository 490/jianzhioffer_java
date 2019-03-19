package secondtime;

/**
 * created by zl on 2019/3/19 15:14
 */
public class binary_tree
{
    int value;
    binary_tree left = null;
    binary_tree right = null;
    public binary_tree createNode(int value)
    {
        binary_tree node = new binary_tree();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }
    public void connectTreeNode(binary_tree node,binary_tree left,binary_tree right)
    {
        if(node != null)
        {
            node.left = left;
            node.right = right;
        }

    }
    public void printTreeNode(binary_tree node)
    {
        if(node != null)
        {
            System.out.print("root:"+node.value+"\t");
            if(node.left != null)
                System.out.print("left:"+node.left.value+"\t");
            else
                System.out.print("left:X\t");
            if(node.right != null)
                System.out.print("right:"+node.right.value+"\t");
            else
                System.out.print("right:X\t");
        }

        System.out.println();
    }
    public void printTree(binary_tree root)
    {
        printTreeNode(root);
        if(root != null)
        {
            if(root.left != null)
                printTree(root.left);
            if(root.right != null)
                printTree(root.right);
        }

    }
}

