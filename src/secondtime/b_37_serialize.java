package secondtime;

import java.util.ArrayList;
import java.util.List;

/**
 * created by zl on 2019/3/22 16:54
 */
public class b_37_serialize
{
    static List<Integer> s = new ArrayList<>();
    static int i =0;

    public void serialize(binary_tree root)
    {
        if(root == null)
            return;
        s.add(root.value);
        if(root.left != null)
        {
            serialize(root.left);
        }
        else
            s.add(-1);
        if(root.right !=null)
        {
            serialize(root.right);
        }
        else
            s.add(-1);
    }

    public binary_tree des()
    {
        int value = s.get(i++);
        int len = s.size();
        if(i > len)
            return null;
        binary_tree node = null;
        if(value != -1)
        {
            node = new binary_tree();
            node.value = value;
            node.left = des();
            node.right = des();
        }


        return node;
    }

    public static void main(String[] args) {
        b_37_serialize c = new b_37_serialize();
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(1);
        binary_tree t2 = t.createNode(2);
        binary_tree t3 = t.createNode(3);
        binary_tree t4 = t.createNode(4);
        binary_tree t5 = t.createNode(5);
        binary_tree t6 = t.createNode(6);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,null);
        t.connectTreeNode(t3,t5,t6);
        c.serialize(t1);
        System.out.println(s);

        t.printTree(c.des());
    }
}
