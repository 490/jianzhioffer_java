package secondtime;

/**
 * created by zl on 2019/3/25 7:37
 */
public class b_55_balance
{
    public boolean isbalance(binary_tree root,int len)
    {
        if(root == null)
        {
            len = 0;
            return true;
        }
        int left=0,right=0;
        if(isbalance(root.right,right) && isbalance(root.left,left))
        {
            int diff = left>right?left-right:right-left;
            if(diff<=1)
            {
                len = 1+left>right?left:right;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        b_55_balance b_55_balance = new b_55_balance();
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(1);
        binary_tree t2 = t.createNode(2);
        binary_tree t3 = t.createNode(3);
        binary_tree t4 = t.createNode(4);
        binary_tree t5 = t.createNode(5);
        binary_tree t6 = t.createNode(6);
        binary_tree t7 = t.createNode(7);
        binary_tree t8 = t.createNode(8);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,null,t6);
        t.connectTreeNode(t5,t7,null);
        System.out.println(b_55_balance.isbalance(t1,0));
    }
}
