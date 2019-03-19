package firsttime;

public class numberofk_53_1
{
    static int []data = {1,2,3,3,3,3,4,5};

    public int getfirst(int len, int k, int start, int end)
    {

        if(start>end)
            return -1;
        int mid = (start+end)/2;
        int middata = data[mid];
        if(middata == k)
        {
            if((mid>0)&& data[mid-1]!=k || mid ==0)
            {
                return mid;
            }
            else
                end = mid-1;
        }
        else if(middata > k)
            end = mid-1;
        else
            start = mid+1;
        return getfirst(len,k,start,end);

    }
    public int getlast(int len, int k, int start, int end)
    {
        if(start>end)
            return -1;
        int mid = (start+end)/2;
        int middata = data[mid];
        if(middata == k)
        {
            if((mid<len-1)&& data[mid+1]!=k || mid ==len-1)
            {
                return mid;
            }
            else
                start = mid+1;
        }
        else if(middata > k)
            start = mid+1;
        else
            end = mid-1;
        return getlast(len,k,start,end);
    }
    public static void main(String[] args)
    {
        int len = data.length;
        int k = 3;
        numberofk_53_1 n = new numberofk_53_1();
        int first = n.getfirst(len,k,0,len-1);
        int last = n.getlast(len,k,0,len-1);
        int num = 0;
        if(first > -1 && last > -1)
            num = last-first+1;
        System.out.println(num);
    }
}
