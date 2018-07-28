public class substructureintree_26
{
    public boolean equal(int num1,int num2)
    {
        if((num1-num2<0.00001)&&(num1-num2>-0.00001))
            return true;
        else
            return false;
    }
    public boolean doestree1havetree2(treenode root1,treenode root2)
    {
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(equal(root1.value,root2.value)==false)
        {
            //System.out.println(root1.value+"xx"+root2.value);
            return false;
        }
        return doestree1havetree2(root1.left,root2.left) && doestree1havetree2(root1.right,root2.right);
    }
    public boolean hassubtree(treenode root1,treenode root2)
    {
        boolean re = false;
        if (root1 != null && root2 != null)
        {
            if(equal(root1.value,root2.value))
            {
                // System.out.println(root1.value);
                re = doestree1havetree2(root1,root2);
            }
            if(re==false)//false，说明以root1和2为根节点没匹配上，试一下root1.left和root2
            {
                re = hassubtree(root1.left,root2);
            }
            if(re==false)//left也没匹配上，试下right。。总之root2是不变的，去遍历root1
            {
                re = hassubtree(root1.right,root2);
            }
        }
        return re;
    }
    public static void main(String[] args)
    {
        substructureintree_26 s = new substructureintree_26();
        treenode tree = new treenode();
        treenode t1 = tree.createBTreeNode(8);
        treenode t2 = tree.createBTreeNode(8);
        treenode t3 = tree.createBTreeNode(7);
        treenode t4 = tree.createBTreeNode(9);
        treenode t5 = tree.createBTreeNode(2);
        treenode t6 = tree.createBTreeNode(4);
        treenode t7 = tree.createBTreeNode(7);
        tree.connectTreeNode(t1,t2,t3);
        tree.connectTreeNode(t2,t4,t5);
        tree.connectTreeNode(t5,t6,t7);


        treenode s1 = tree.createBTreeNode(8);
        treenode s2 = tree.createBTreeNode(9);
        treenode s3 = tree.createBTreeNode(2);
        tree.connectTreeNode(s1,s2,s3);
        System.out.println(s.hassubtree(t1,s1));
    }
}
