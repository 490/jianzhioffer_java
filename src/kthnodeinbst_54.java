public class kthnodeinbst_54
{
    static int k = 3;
    public treenode find(treenode root )
    {
        if(root == null || k == 0)
            return null;
        return core(root);
    }
    public treenode core(treenode root )
    {
        treenode p = null;
        if(root.left != null)
            p = core(root.left);
        if(p == null)
        {
            if (k==1)
                p = root;
            k--;
        }
        if(p ==null && root.right!=null)
            p = core(root.right);

        return p;
    }
    public static void main(String[] args)
    {
        kthnodeinbst_54 k = new kthnodeinbst_54();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(5);
        treenode t2 = t.createBTreeNode(3);
        treenode t3 = t.createBTreeNode(7);
        treenode t4 = t.createBTreeNode(2);
        treenode t5 = t.createBTreeNode(4);
        treenode t6 = t.createBTreeNode(6);
        treenode t7 = t.createBTreeNode(8);
        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);
        System.out.println(k.find(t1).value);
    }
}
