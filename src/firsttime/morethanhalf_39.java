package firsttime;

public class morethanhalf_39
{
    public static int a1[]={1, 2, 3, 2, 2, 2, 5, 4, 2};
    public static int a2[]={1, 2, 3, 2, 4, 2, 5, 2, 3};
    public static int a3[]={2, 2, 2, 2, 2, 1, 3, 4, 5};
    public static int a4[]={1, 3, 4, 5, 2, 2, 2, 2, 2};
    public int partition(int []a,int len,int start,int end)
    {
        if(start>end)
            return -1;
        int tmp=a[start];
        int i = start;
        int j = end;
        while(i!=j)
        {
            while(a[j]>=tmp && i<j)
                j--;
            while(a[i]<=tmp && i<j)
                i++;
            if(i<j)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[start]=a[i];
        a[i]=tmp;
        return i;
    }
    public boolean checkmorethanhalf(int[]a,int re,int len)
    {
        int times=0;
        for(int i =0;i<len;i++)
            if(a[i]==re)
                times++;
        if(times*2<=len)
            return false;
        else
            return true;
    }
    public int find(int []a)
    {
        int len=a.length;
        int mid=len>>1;
        int start=0;
        int end=len-1;
        int index=partition(a,len,start,end);
        while(index!=mid)
        {
            if(index>mid)
            {
                end=index-1;
                index=partition(a,len,start,end);
            }
            else
            {
                start=index+1;
                index=partition(a,len,start,end);
            }
        }
        int re = a[mid];
        if(checkmorethanhalf(a,re,len))
        return re;
        else
            return 0;
    }
    public int find2(int[]a)
    {
        int len=a.length;
        int re=a[0];
        int times=1;
        for(int i = 0;i<len;i++)
        {
            if(times==0)
            {
                re=a[i];
                times=1;
            }
            else if(a[i]==re)
            {
                times++;
            }
            else
                times--;
        }
        if(checkmorethanhalf(a,re,len))
            return re;
        else
            return -1;
    }
    public static void main(String[] args)
    {
        morethanhalf_39 m = new morethanhalf_39();

        System.out.println( m.find2(a1));
        System.out.println( m.find2(a2));
        System.out.println( m.find2(a3));
        System.out.println( m.find2(a4));

    }
}
