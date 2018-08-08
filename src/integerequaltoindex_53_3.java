public class integerequaltoindex_53_3
{
    static int[] data = {-3,-1,1,3,4};
    public int find()
    {
        int len = data.length;
        int left = 0;
        int right = len-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(mid == data[mid])
                return mid;
            else if(data[mid] > mid)
                right = mid-1;
            else if(data[mid]<mid)
                left = mid+1;
        }
        if(left==len)
            return len-1;
        return -1;
    }
    public static void main(String[] args)
    {
        integerequaltoindex_53_3 i = new integerequaltoindex_53_3();
        System.out.println(i.find());
    }
}
