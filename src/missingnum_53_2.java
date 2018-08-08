public class missingnum_53_2
{
    static int[] data = {0,1,2,3,4,5,7,8,9};
    public int get()
    {
        int len = data.length;
        int left = 0;
        int right = len -1 ;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(data[mid] == mid)
            {
                left = mid+1;
            }
            else if(mid==0 || data[mid-1]==mid-1)
                return mid;
            else
                right = mid-1;
        }
        if(left == len)
            return len;
        return -1;
    }
    public static void main(String[] args)
    {
        missingnum_53_2 m = new missingnum_53_2();
        System.out.println(m.get());
    }
}
