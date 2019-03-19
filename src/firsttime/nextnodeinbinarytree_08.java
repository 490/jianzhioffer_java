package firsttime;

class treenode
{
    int value;
    treenode left;
    treenode right;
    treenode parent;
    public treenode createBTreeNode(int value)
    {
        treenode node = new treenode();
        node.value = value;
        node.left = null;
        node.right = null;
        node.parent = null;
        return node;
    }
    public void connectTreeNode(treenode parent,treenode left,treenode right)
    {
        if(parent!=null)
        {
            parent.left = left;
            parent.right = right;
            if(left!=null)
                left.parent = parent;
            if(right != null)
                right.parent = parent;
        }
    }
    public void printTreeNode(treenode node)
    {
        if(node!=null)
        {
            System.out.println("root:"+node.value);
            if(node.left!=null)
                System.out.println("left:"+node.left.value);
            else
                System.out.println("left=*");
            if(node.right!=null)
                System.out.println("righy="+node.right.value);
            else
                System.out.println("right=*");
        }
        else
            System.out.println("root=*");
        System.out.println();
    }
    public void printTree(treenode node)
    {
        printTreeNode(node);
        if(node!=null)
        {
            if(node.left!=null)
                printTreeNode(node.left);
            if(node.right!=null)
                printTreeNode(node.right);
        }
    }
}
public class nextnodeinbinarytree_08
{
    public static treenode getNext(treenode node)
    {
        if(node == null)
            return null;
        treenode next = null;
        if(node.right!=null)
        {
            treenode right = node.right;
            while(right.left!=null)
                right = right.left;
            next =right;
        }
        else if(node.parent!=null)
        {
            treenode current = node;
            treenode parent = node.parent;
            while(parent!=null && current==parent.right)
            {
                current=parent;
                parent=parent.parent;
            }
            next=parent;
        }

        return next;

    }
    public static void test(treenode node,treenode expect)
    {
        treenode pnode = getNext(node);
        if(pnode==expect)
            System.out.println("passed");
        else
            System.out.println("failed");
    }

    public static void main(String[] args)
    {
        treenode x = new treenode();
        treenode pNode8 = x.createBTreeNode(8);
        treenode pNode6 = x.createBTreeNode(6);
        treenode pNode10 = x.createBTreeNode(10);
        treenode pNode5 = x.createBTreeNode(5);
        treenode pNode7 = x.createBTreeNode(7);
        treenode pNode9 = x.createBTreeNode(9);
        treenode pNode11 = x.createBTreeNode(11);

        x.connectTreeNode(pNode8, pNode6, pNode10);
        x.connectTreeNode(pNode6, pNode5, pNode7);
        x.connectTreeNode(pNode10, pNode9, pNode11);

        test(pNode8, pNode9);
    }
}
