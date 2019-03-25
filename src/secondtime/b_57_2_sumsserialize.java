package secondtime;

/**
 * created by zl on 2019/3/25 9:26
 */
public class b_57_2_sumsserialize
{
    public void find(int n)
    {
        int small = 1;
        int big = 2;
        int sum =0;
        while(small<big)
        {
            sum = add(small , big);
            //System.out.println(+small+"+"+big+"="+sum);

            if(sum == n)
            {
                print(small,big);
                big++;
                small++;
                System.out.println();
            }
            else if(sum < n)
                big++;
            else if(sum > n)
                small++;
        }
    }
    public int add(int small,int big)
    {
        int re=0;
        for(int i = small;i<=big;i++)
            re+=i;
        return re;
    }
    public void print(int small,int big)
    {
        for(int i = small;i<=big;i++)
            System.out.print( i+"\t");
    }
    public static void main(String[] args) {
        b_57_2_sumsserialize c = new b_57_2_sumsserialize();
        c.find(15);
    }
}
