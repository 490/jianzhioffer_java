package secondtime;

/**
 * created by zl on 2019/3/24 18:21
 */
public class b_54_kthnode
{
    static  int k = 2;
    public binary_tree find(binary_tree root)
    {
        if(root == null)
            return null;
        return core(root);
    }
    public binary_tree core(binary_tree root)
    {
        binary_tree p = null;
        if(root.left!=null)
            p = core(root.left);
        if(p==null)
        {
            if(k==1)
                p=root;
            k--;
        }
        if(p==null &&root.right != null)
            p = core(root.right);
        return p;
    }
    public static void main(String[] args) {
        b_54_kthnode k = new b_54_kthnode();
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(5);
        binary_tree t2 = t.createNode(3);
        binary_tree t3 = t.createNode(7);
        binary_tree t4 = t.createNode(2);
        binary_tree t5 = t.createNode(4);
        binary_tree t6 = t.createNode(6);
        binary_tree t7 = t.createNode(8);
        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);
        System.out.println(k.find(t1).value);
    }
}
