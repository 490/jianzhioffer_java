public class symmetrical_28
{
    public boolean check(treenode t)
    {
        return check(t,t);
    }
    public boolean check(treenode t1,treenode t2)
    {
        if(t1==null && t2==null)
            return true;
        if(t1==null||t2==null)
        {
            //System.out.println(".....");
            return false;
        }
        if(t1.value!=t2.value)
        {
            System.out.println(t1.value+">>>"+t2.value);
            return false;
        }
        return check(t1.left,t2.right) && check(t1.right,t2.left);
    }

    public static void main(String[] args)
    {
        symmetrical_28 m = new symmetrical_28();
        treenode tree = new treenode();
        treenode t1 = tree.createBTreeNode(8);
        treenode t2 = tree.createBTreeNode(6);
        treenode t3 = tree.createBTreeNode(6);
        treenode t4 = tree.createBTreeNode(5);
        treenode t5 = tree.createBTreeNode(7);
        treenode t6 = tree.createBTreeNode(7);
        treenode t7 = tree.createBTreeNode(5);
        tree.connectTreeNode(t1,t2,t3);
        tree.connectTreeNode(t2,t4,t5);
        tree.connectTreeNode(t3,t6,t7);
        System.out.println(m.check(t1));
    }
}
