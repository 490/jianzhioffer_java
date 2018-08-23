public class contignouscard_61
{
    public int partition(int[] num,int len,int start ,int end)
    {
        if(start > end)
            return -1;
        int tmp = num[start];
        int i = start;
        int j = end;
        while(i!=j)
        {
            while(num[j] >= tmp &&i < j )
                j--;
            while(num[i] <= tmp&&i < j  )
                i++;
            if(i < j)
            {
                int t = num[i];
                num[i] = num[j];
                num[j] = t;
            }
        }
        num[start] = num[i];
        num[i] = tmp;
        return i;
    }
    public void qsort(int [] num,int len,int start,int end)
    {
        if(start==end)
            return;
        int index = partition(num,len,start,end);
        if(index > start)
            qsort(num,len,start,index-1);
        if(index < end)
            qsort(num,len,index+1,end);
    }

    public boolean is(int[] num,int len)
    {
        if(num==null || len<1)
            return false;
        qsort(num,len,0,len-1);
        int num_zero = 0;
        int num_gap = 0;
        for(int i = 0;i < len && num[i] == 0;i++)
            num_zero ++;
        int small = num_zero;//排好序了，所以要跳过0
        int big = small + 1;
        while(big < len)
        {
            if(num[small] == num[big])
                return false;
            num_gap += num[big] - num[small] -1;
            small = big;
            big ++;
        }
        return (num_gap > num_zero) ? false :true;
    }
    public static void main(String[] args)
    {
        contignouscard_61 c= new contignouscard_61();
        int[] num ={1,2,3,0,6};
        int len = num.length;
        System.out.println(c.is(num,len));
        //c.qsort(num,len,0,len-1);

    }
}
