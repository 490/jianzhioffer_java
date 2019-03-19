package firsttime;

public class BINARY_TREE
{
     int value;
     BINARY_TREE left;
     BINARY_TREE right;
    public BINARY_TREE createBinaryTree(int value)
    {
        BINARY_TREE node = new BINARY_TREE();
        node.value = value;
        node.left = null;
        node.right = null;
        return  node;
    }
    public void connectTreeNode(BINARY_TREE parent,BINARY_TREE left,BINARY_TREE right)
    {
        if(parent!=null)
        {
            parent.left = left;
            parent.right = right;
        }

    }
    public void printTreeNode(BINARY_TREE node)
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
        //else
        //  System.out.print("X");
        System.out.println();
    }
    public void printTree(BINARY_TREE root)
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
