public class reorderarray_21
{
    static int[]str;
    public void reorder(int[]str)
    {
        int len=str.length;
        int start=0;
        int end=len-1;
        while(start<end)
        {
            while(start<end && str[start]%2==1)
                start++;
            while(end>start && str[end]%2==0)
                end--;
            if(start<end)
            {
                int tmp=str[start];
                str[start]=str[end];
                str[end]=tmp;
            }
        }
    }
    public static void main(String[] args)
    {
        reorderarray_21 r = new reorderarray_21();
        r.str=new int[]{1,2,3,4,5,6,7};
        r.reorder(r.str);
        for(int i =0;i<str.length;i++)
            System.out.println(str[i]);
    }
}
