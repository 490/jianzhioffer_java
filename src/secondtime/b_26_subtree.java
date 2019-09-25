package secondtime;

/**
 * created by zl on 2019/3/21 9:57
 */
public class b_26_subtree
{
    public boolean core(binary_tree t1,binary_tree t2)
    {
        if(t2 == null)
            return true;
        if(t1 == null)
            return false;
        if(t1.value != t2.value)
            return false;
        return core(t1.left,t2.left) && core(t1.right,t2.right);
    }

    public boolean hassubtree(binary_tree t1,binary_tree t2)
    {
        boolean result = false;
        if(t1 != null && t2 != null)
        {
            if(t1.value == t2.value)
                result = core(t1,t2);
            if(result == false)
                result = hassubtree(t1.left,t2);//false，说明以root1和2为根节点没匹配上，试一下root1.left和root2
            if(result == false)
                result = hassubtree(t1.right,t2);//left也没匹配上，试下right。。总之root2是不变的，去遍历root1
        }
        return result;
    }
    public static void main(String[] args) {
        b_26_subtree s = new b_26_subtree();
        binary_tree tree = new binary_tree();
        binary_tree t1 = tree.createNode(8);
        binary_tree t2 = tree.createNode(8);
        binary_tree t3 = tree.createNode(7);
        binary_tree t4 = tree.createNode(9);
        binary_tree t5 = tree.createNode(2);
        binary_tree t6 = tree.createNode(4);
        binary_tree t7 = tree.createNode(7);
        tree.connectTreeNode(t1,t2,t3);
        tree.connectTreeNode(t2,t4,t5);
        tree.connectTreeNode(t5,t6,t7);


        binary_tree s1 = tree.createNode(8);
        binary_tree s2 = tree.createNode(9);
        binary_tree s3 = tree.createNode(2);
        tree.connectTreeNode(s1,s2,s3);
        System.out.println(s.hassubtree(t1,s1));
    }
}
