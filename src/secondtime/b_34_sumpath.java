package secondtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * created by zl on 2019/3/22 7:59
 */
public class b_34_sumpath
{

    public void findpath(binary_tree root,int value)
    {
        if(root == null)
            return;
        int sum = 0;
        List<Integer> path = new ArrayList<>();
        findpath(root,value,path,sum);
    }
    public void findpath(binary_tree root,int value,List<Integer> path,int sum)
    {
        sum += root.value;
        path.add(root.value);
        boolean leaf = root.left==null && root.right==null;
        if(sum == value && leaf)
        {
            System.out.println("path:"+path);
        }
        if(root.left !=null)
        {
            findpath(root.left,value,path,sum);
        }
        if(root.right !=null)
        {
            findpath(root.right,value,path,sum);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        b_34_sumpath b_34_sumpath = new b_34_sumpath();
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(10);
        binary_tree t2 = t.createNode(5);
        binary_tree t3 = t.createNode(12);
        binary_tree t4 = t.createNode(4);
        binary_tree t5 = t.createNode(7);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        b_34_sumpath.findpath(t1,22);
    }
}
