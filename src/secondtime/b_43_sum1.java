package secondtime;

/**
 * created by zl on 2019/3/24 10:54
 */
public class b_43_sum1
{
    public void sum(int n)
    {
        if(n<=0)
            return;
        int count = 0;
        for(long i = 1;i<=n;i*=10)
        {
            count += (n/(i*10))*i + notcomplete(n%(i*10),i);
        }
        System.out.println(count);
    }
    public long notcomplete(long k,long i)
    {
        if(k>2*i-1)
            return i;
        else if(k<i)
            return 0;
        else
            return k-i+1;
    }
    public static void main(String[] args) {
        b_43_sum1 sum1 = new b_43_sum1();
        sum1.sum(12);
    }
}
