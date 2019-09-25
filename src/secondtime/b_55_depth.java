package secondtime;

/**
 * created by zl on 2019/3/25 7:22
 */
public class b_55_depth
{
    static int max = 0;
    public void depth(binary_tree root,int len)
    {

    }
    public int depth(binary_tree root)
    {
        int left = 0;
        int right = 0;
        if(root == null)
            return 0;
        left = depth(root.left);
        right = depth(root.right);
        return left>right ? left+1:right+1;
    }
    public static void main(String[] args) {

        b_55_depth d = new b_55_depth();
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(1);
        binary_tree t2 = t.createNode(2);
        binary_tree t3 = t.createNode(3);
        binary_tree t4 = t.createNode(4);
        binary_tree t5 = t.createNode(5);
        binary_tree t6 = t.createNode(6);
        binary_tree t7 = t.createNode(7);
        binary_tree t8 = t.createNode(8);

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
        System.out.println( d.depth(t1));
    }
}
