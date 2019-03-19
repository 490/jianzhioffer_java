package secondtime;

/**
 * created by zl on 2019/3/19 15:28
 */
public class b_07_rebuildtree
{
    public binary_tree rebuild(int[] pre,int[] mid)
    {
        if(pre==null || (pre!=null && pre.length==0))
            return null;
        return core(0,pre.length-1,pre,0,mid.length-1,mid);
    }
    public binary_tree core(int preStart,int preEnd,int[] pre,int midStart,int midEnd,int[] mid)
    {
        if(preStart > preEnd|| midStart > midEnd)
            return null;
        binary_tree node = new binary_tree();
        int rootValue = pre[preStart];
        node.value = rootValue;
        node.left = null;
        node.right = null;
        for(int i = midStart;i < midEnd ;i ++)
        {
            if(mid[i] == rootValue)
            {
                node.left = core(preStart+1,i-midStart+preStart,pre,midStart,i-1,mid);
                node.right = core(i-midStart+preStart+1,preEnd,pre,i+1,midEnd,mid);
                break;
            }
        }
        return node;
    }


    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] mid = {4,7,2,1,5,3,8,6};
        b_07_rebuildtree rebuildtree = new b_07_rebuildtree();
        binary_tree root = rebuildtree.rebuild(pre,mid);
    }
}
