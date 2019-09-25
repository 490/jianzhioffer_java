package secondtime;

import java.util.*;

/**
 * created by zl on 2019/3/21 19:15
 */
public class b_32_printtree
{
    /*static Set<Integer> set = new HashSet<>();
    public void print(binary_tree root)
    {
        if(root == null)
            return;
        System.out.print(root.value+" ");
        System.out.println();
        set.add(1);
        print2(root,1);
    }
    public void print2(binary_tree root,int i)
    {
        if(root == null)
            return;
       // System.out.println("---------i="+i+",set="+set.contains(i));

        if(i%2==1)
        {

            if(root.left != null)
            {
                System.out.print(root.left.value+" ");
            }
            if(root.right != null)
            {
                System.out.print(root.right.value+" ");
            }
            //set.add(i);
            print2(root.right,i+1);
            print2(root.left,i+1);
        }else
        {
            if(root.right != null)
            {
                System.out.print(root.right.value+" ");
            }
            if(root.left != null)
            {
                System.out.print(root.left.value+" ");
            }
            //set.add(i);
            print2(root.left,i+1);
            print2(root.right,i+1);
        }
    }*/

    static Queue<binary_tree> queue = new LinkedList<>();
    public void print(binary_tree root)
    {
        if(root == null)
            return;
        queue.add(root);
        int nextlevelnodenum = 0;
        int tobeprint = 1;
        while(queue.size() > 0)
        {
            binary_tree node = queue.poll();
            System.out.print(node.value);
            if(node.left != null)
            {
                nextlevelnodenum++;
                queue.add(node.left);
            }
            if(node.right != null)
            {
                nextlevelnodenum++;
                queue.add(node.right);
            }
            tobeprint--;
            if(tobeprint == 0)
            {
                System.out.println();
                tobeprint = nextlevelnodenum;
                nextlevelnodenum = 0;
            }
        }
    }

    public static void main(String[] args) {
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(1);
        binary_tree t2 = t.createNode(2);
        binary_tree t3 = t.createNode(3);
        binary_tree t4 = t.createNode(4);
        binary_tree t5 = t.createNode(5);
        binary_tree t6 = t.createNode(6);
        binary_tree t7 = t.createNode(7);
        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);

        b_32_printtree b_32_printtree = new b_32_printtree();
        b_32_printtree.print(t1);
    }
}
