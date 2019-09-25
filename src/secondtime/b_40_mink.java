package secondtime;

/**
 * created by zl on 2019/3/23 14:46
 */
public class b_40_mink
{

    public int partition(int[] a,int start,int end)
    {
        int i = start;
        int j = end;
        int tmp = a[start];
        while(i<j)
        {
            while(i<j && a[j]>=tmp)
                j--;
            while(i<j && a[i]<=tmp)
                i++;
            if(i<j)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[start] = a[i];
        a[i] = tmp;
        return i;
    }
    public void find(int[] a,int k)
    {
        if(a.length < k||a==null||a.length==0||k<=0)
            return;
        int start = 0;
        int end = a.length-1;
        int index = partition(a,start,end);
        while(index != k-1)
        {
            if(index > k)
            {
                index = partition(a,start,index-1);
            }
            if(index <k)
            {
                index = partition(a,index+1,end);
            }
        }
        for(int i = 0;i < k;i++)
            System.out.print(a[i]+"\t");
    }

    public static void main(String[] args) {
        b_40_mink b_40_mink = new b_40_mink();
        int data[] = {4, 5, 1, 6, 2, 7, 3, 8};

        b_40_mink.find(data,6);
    }
}
