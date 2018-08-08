public class balancebt_55_2
{
    static int depth=0;
    public boolean isbalance(treenode root)
    {
         treedepth_55_1 ttt = new treedepth_55_1();
         if(root==null)
             return true;
         int left = ttt.treedepth(root.left);
         int right = ttt.treedepth(root.right);
         int diff = left-right;
         if(diff>1 || diff<-1)
             return false;
         return isbalance(root.left) && isbalance(root.right);
    }
    public static void main(String[] args)
    {
        balancebt_55_2 b = new balancebt_55_2();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(1);
        treenode t2 = t.createBTreeNode(2);
        treenode t3 = t.createBTreeNode(3);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(5);
        treenode t6 = t.createBTreeNode(6);
        treenode t7 = t.createBTreeNode(7);
        treenode t8 = t.createBTreeNode(8);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,null,t6);
        t.connectTreeNode(t5,t7,null);
        System.out.println(b.isbalance(t1));
    }
}
