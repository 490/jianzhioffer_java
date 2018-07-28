import java.util.ArrayList;
import java.util.List;

public class pathintree_34
{
    public void findpath(treenode t,int num)
    {
        if(t==null)
            return;
        List<Integer> path = new ArrayList<>();
        int currsum=0;
        findpath(t,num,path,currsum);

    }
    public void findpath(treenode t,int num,List<Integer>path,int currsum)
    {
        currsum += t.value;
        path.add(t.value);

        boolean isleaf = t.left==null && t.right==null;
        if(currsum == num && isleaf)
        {
            System.out.println("path:"+path);
        }
        if(t.left!=null)
            findpath(t.left,num,path,currsum);
        if(t.right!=null)
            findpath(t.right,num,path,currsum);
        path.remove(path.size()-1);
    }
    public static void main(String[] args)
    {
        pathintree_34 h = new pathintree_34();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(10);
        treenode t2 = t.createBTreeNode(5);
        treenode t3 = t.createBTreeNode(12);
        treenode t4 = t.createBTreeNode(4);
        treenode t5 = t.createBTreeNode(7);


        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        h.findpath(t1,10);
    }
}
