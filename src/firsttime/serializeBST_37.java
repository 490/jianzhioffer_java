package firsttime;

import java.util.ArrayList;
import java.util.List;

public class serializeBST_37
{
    static List<Integer> s = new ArrayList<>();
    static int i =0;
    public void serialize(treenode root)
    {
        if(root==null)
        {
            s.add(0);
            return;
        }
        s.add(root.value);
        serialize(root.left);
        serialize(root.right);
    }
    public treenode des()
    {
        int num = s.get(i++);
        int len = s.size();
        if(i>len)
            return null;
        treenode node = null;
        if(num!=0)
        {
            node = new treenode();
            node.value = num;
            node.left = des();
            node.right = des();
        }
        return node;
    }
    public static void main(String[] args)
    {
        serializeBST_37 c= new serializeBST_37();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(1);
        treenode t2 = t.createBTreeNode(2);
        treenode t3 = t.createBTreeNode(3);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(5);
        treenode t6 = t.createBTreeNode(6);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,null);
        t.connectTreeNode(t3,t5,t6);
        c.serialize(t1);
        System.out.println(s);

        t.printTree(c.des());
    }
}
