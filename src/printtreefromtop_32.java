import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class printtreefromtop_32
{
    static Queue<treenode> q= new LinkedList<>();
    public void print(treenode t)
    {
       if(t==null)
           return;
       q.add(t);
       while(q.size()>0)
       {
           treenode node = q.poll();
           System.out.println(node.value);
           if(node.left!=null)
               q.add(node.left);
           if(node.right!=null)
               q.add(node.right);
       }

    }
    public static void main(String[] args)
    {
        printtreefromtop_32 p = new printtreefromtop_32();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(1);
        treenode t2 = t.createBTreeNode(2);
        treenode t3 = t.createBTreeNode(3);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(5);
        treenode t6 = t.createBTreeNode(6);
        treenode t7 = t.createBTreeNode(7);
        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);
        p.print(t1);
     //   System.out.println(q);
    }
}
