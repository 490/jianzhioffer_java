import java.util.*;

public class printtreezigzag_32_03
{
    static Queue<treenode> q= new LinkedList<>();
    static Stack<treenode> stack1 = new Stack<>();
    static Stack<treenode> stack2 = new Stack<>();
    public void print(treenode t)
    {
        int o =1 ;
        if(t==null)
            return;
        stack2.push(t);
        int nextlevelnodenum=0;
        int tobeprint=1;
        while(stack1.size()>0||stack2.size()>0)
        {

            if(o%2==0)
            {
                treenode node = stack1.pop();
                System.out.print(node.value);
                if(node.right!=null)
                {
                    nextlevelnodenum++;
                    stack2.push(node.right);
                }
                if(node.left!=null)
                {
                    nextlevelnodenum++;
                    stack2.add(node.left);
                }
            }else if(o%2==1)
            {
                treenode node = stack2.pop();
                System.out.print(node.value);
                if(node.left!=null)
                {
                    nextlevelnodenum++;
                    stack1.push(node.left);
                }
                if(node.right!=null)
                {
                    nextlevelnodenum++;
                    stack1.push(node.right);
                }
            }
            tobeprint--;
            if(tobeprint==0)
            {
                System.out.println();
                tobeprint=nextlevelnodenum;
                nextlevelnodenum=0;
                o++;
            }
        }

    }
    public static void main(String[] args)
    {
        printtreezigzag_32_03 p = new printtreezigzag_32_03();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(1);
        treenode t2 = t.createBTreeNode(2);
        treenode t3 = t.createBTreeNode(3);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(5);
        treenode t6 = t.createBTreeNode(6);
        treenode t7 = t.createBTreeNode(7);

        treenode t8 = t.createBTreeNode(8);
        treenode t9 = t.createBTreeNode(9);
        treenode t10 = t.createBTreeNode(10);
        treenode t11 = t.createBTreeNode(11);
        treenode t12 = t.createBTreeNode(12);
        treenode t13 = t.createBTreeNode(13);
        treenode t14 = t.createBTreeNode(14);
        treenode t15 = t.createBTreeNode(15);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);

        t.connectTreeNode(t4,t8,t9);
        t.connectTreeNode(t5,t10,t11);
        t.connectTreeNode(t6,t12,t13);
        t.connectTreeNode(t7,t14,t15);

        p.print(t1);
        //   System.out.println(q);
    }
}
