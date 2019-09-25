package recitation;


/**
 * created by zl on 2019/3/26 9:25
 */
public class c_07_rebuildtree
{
    public binary_tree rebuild(int[] pre,int[] mid)
    {
        if(pre==null  || mid == null)
            return null;
        binary_tree root = core(pre,0,pre.length-1,mid,0,mid.length-1);
        return root;
    }
    public binary_tree core (int[]pre,int prestart,int preend,int[] mid,int midstart,int midend)
    {
        if(prestart>preend || midstart>midend)
            return null;
        int value = pre[prestart];
        binary_tree node = new binary_tree();
        node.value = value;
        node.left = null;
        node.right = null;
        for(int i = midstart;i <= midend;i++)
        {
            if(mid[i] == pre[prestart])
            {
                node.left = core(pre,prestart+1,prestart+i-midstart,mid,midstart,i-1);
                node.right = core(pre,prestart+i-midstart+1,preend,mid,i+1,midend);
            }
        }
        return node;
    }
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] mid = {4,7,2,1,5,3,8,6};
        c_07_rebuildtree rebuildtree = new c_07_rebuildtree();
        binary_tree root = rebuildtree.rebuild(pre,mid);
        root.printTree(root);
    }

}
