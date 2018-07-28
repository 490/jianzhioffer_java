public class convertBST_36
{
     static treenode lastnode = null;
    public  treenode convert(treenode root)
    {
        convertNode(root);
        //System.out.println(lastnode.value);
        treenode headnode = lastnode;
        while(headnode!=null && headnode.left!=null)
        {
            headnode = headnode.left;
          //  System.out.println(headnode.value);

        }
       // System.out.println(headnode.value);
        return headnode;
    }
    public  void convertNode( treenode root)
    {
       // if(lastnode!=null)
       //             System.out.println(lastnode.value);

        if(root==null)
            return;
        treenode curr = root;
        if(curr.left!=null)
            convertNode(curr.left);
        curr.left = lastnode;
        if(lastnode!=null)
        {
            lastnode.right = curr;
        }
        lastnode = curr;
        if(curr.right!=null)
        {   //System.out.println(curr.right.value);
            convertNode(curr.right);
        }
    }
    public  void print(treenode pHeadOfList)
    {
        treenode pNode = pHeadOfList;

        System.out.println("The nodes from left to right are:");
        while(pNode != null)
        {
            System.out.print("\t"+ pNode.value);

            if(pNode.right == null)
                break;
            pNode = pNode.right;
        }

        System.out.println("\nThe nodes from right to left are:");
        while(pNode != null)
        {
            System.out.print("\t"+pNode.value);

            if(pNode.left == null)
                break;
            pNode = pNode.left;
        }

    }
    public static void main(String[] args)
    {
        convertBST_36 c= new convertBST_36();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(10);
        treenode t2 = t.createBTreeNode(6);
        treenode t3 = t.createBTreeNode(14);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(8);
        treenode t6 = t.createBTreeNode(12);
        treenode t7 = t.createBTreeNode(16);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);
        c.print(c.convert(t1));
    }

}





















