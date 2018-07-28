public class houxubianli_33
{
    static int [] n =new int[]{4, 6, 12, 8, 16, 14, 10};
    public boolean check(int start  ,int len)
    {
        if(n==null||len<=0)
            return false;
        int root = n[len+start-1];
        //System.out.println(root);
        int i = start;
      //  System.out.println("i="+i);
        for(;i<start+len-1;i++)
        {
                     //      System.out.println(root+","+n[i]);

            if(n[i]>root)
            {
              // System.out.println(root+","+i);
                break;
            }
        }
        int j = i;
        for(;j < start+len-1;j++)
        {

            if(n[j]<root)
            {
                return false;
            }
        }
        boolean left = true;
        if(i>0)
        {
            left = check(0,i);
        }
        boolean right = true;
        if(i<start+len-1)
        {
            right = check(i,start+len-1-i);
        }

        return (left&&right);
    }

    public static void main(String[] args)
    {
        houxubianli_33 h = new houxubianli_33();
        treenode t = new treenode();
        treenode t1 = t.createBTreeNode(8);
        treenode t2 = t.createBTreeNode(6);
        treenode t3 = t.createBTreeNode(10);
        treenode t4 = t.createBTreeNode(5);
        treenode t5 = t.createBTreeNode(7);
        treenode t6 = t.createBTreeNode(9);
        treenode t7 = t.createBTreeNode(11);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);
        int len = n.length;
        System.out.println(h.check(0,len));
    }
}
