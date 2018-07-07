public class binarytree_07
{
    public BINARY_TREE construct(int[] preorder,int[] midorder,int len)
    {
        if(preorder == null || (preorder!=null && preorder.length==0))
            return null;
        return construct_core(preorder, 0,len-1,midorder,0,len-1);
    }
    public BINARY_TREE construct_core(int[] preorder,int start_preorder,int end_preorder,
                                      int[] midorder,int start_midorder,int end_midorder)
    {
        if(start_midorder>end_midorder||start_preorder>end_preorder)
            return null;
        int rootvalue = preorder[start_preorder];
        BINARY_TREE root = new BINARY_TREE();
        root.value = rootvalue;
        root.left = null;
        root.right = null;
        //if()

        //int[] root_midorder = new int[start_midorder.length];
       // System.arraycopy(start_midorder,0,root_midorder,0,start_midorder.length);
       /* int i = 0;
        for(i = 0;i < end_midorder;i++)
        {
            if(midorder[i]==rootvalue)
                break;
        }
       // System.out.println("root:"+i+","+midorder[i]);
        if((i == end_midorder )&&( midorder[i]!=rootvalue))
            System.out.println("invalid input");
        int leftLength = i - start_midorder;
        int leftPreorderEnd = start_preorder+leftLength;
       // System.out.println("leftend:"+leftPreorderEnd);
       // int[] left_preorder = new int[leftLength];
        //System.arraycopy(preorder,0,left_preorder,0,leftLength);
        if(leftLength > 0)
        {
            root.left = construct_core(preorder,start_preorder+1,leftPreorderEnd,midorder,start_midorder,i-1);
        }
        if(leftLength < end_preorder - start_preorder)
        {
            root.right = construct_core(preorder,leftPreorderEnd+1,end_preorder,midorder,i+1,end_midorder);
        }*/
        for(int i=start_midorder;i<=end_midorder;i++)
        {
            if(midorder[i]==rootvalue)
            {
                root.left=construct_core(preorder,start_preorder+1,start_preorder+i-start_midorder,midorder,start_midorder,i-1);
                root.right=construct_core(preorder,i-start_midorder+start_preorder+1,end_preorder,midorder,i+1,end_midorder);
                break;
            }
        }
        return root;

    }
    public void test(int testname,int[]preorder,int[]midorder,int length)
    {
        for(int i = 0; i < length;i++)
            System.out.print(preorder[i]+"\t");
        System.out.println();
        for(int i = 0; i < length;i++)
            System.out.print(midorder[i]+"\t");
        System.out.println();

        BINARY_TREE root = construct(preorder,midorder,length);
        root.printTree(root);
    }
    public void test1()
    {
        int length = 7;
        int preorder[] = {1,2,3,4,5,6,7};
        int midorder[] = {3,2,4,1,6,5,7};
        test(1,preorder,midorder,length);
    }
    public static void main(String[] args)
    {
        binarytree_07 b = new binarytree_07();

        b.test1();
    }
}
