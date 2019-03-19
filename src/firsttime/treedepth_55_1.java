package firsttime;

public class treedepth_55_1
{
static  int max=0;
    public void depth(treenode root,int len)
    {

        if(root==null)
            return;
        int v = root.value;
        if(root.left!=null)
        {
            depth(root.left,len+1);

        }
        if(root.right!=null)
        {
            depth(root.right,len+1);

        }
        if(len>max)
            max=len;
    }
    public int treedepth(treenode root)
    {
        if(root==null)
            return 0;
        int left = treedepth(root.left);
        int right = treedepth(root.right);
        return (left>right)?left+1:right+1;
    }
    public static void main(String[] args)
    {
        treedepth_55_1 tt = new treedepth_55_1();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(1);
        treenode t2 = t.createBTreeNode(2);
        treenode t3 = t.createBTreeNode(3);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(5);
        treenode t6 = t.createBTreeNode(6);
        treenode t7 = t.createBTreeNode(7);
        treenode t8 = t.createBTreeNode(8);

       /* t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,null,t6);
        t.connectTreeNode(t5,t7,null);
        t.connectTreeNode(t7,null,t8);*/
        t.connectTreeNode(t1,t2,null);
        t.connectTreeNode(t2,t3,null);
        t.connectTreeNode(t3,t4,null);
        t.connectTreeNode(t4,t5,null);
        t.connectTreeNode(t5,t6,null);
        t.connectTreeNode(t6,t7,null);
        t.connectTreeNode(t7,t8,null);
        tt.depth(t1,1);
        System.out.println(max);
    }
}
