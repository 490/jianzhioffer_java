package secondtime;

/**
 * created by zl on 2019/3/20 8:23
 */
public class b_14_cutrope
{
    public int cut(int n)
    {
        if(n<2)
            return 0;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int[] count = new int[n+1];
        count[0]  = 0;
        count[1] = 1;
        count[2] = 2;
        count[3] = 3;
        for(int i = 4;i <= n;i++)
        {
            int max=0;
            for(int j = 1;j < i;j++)
            {
                if(max < count[j] * count[i-j])
                {
                    max = count[j] * count[i-j];
                }
                count[i] = max;
            }
        }
        return count[n];
    }
    public static void main(String[] args) {
        b_14_cutrope cutrope = new b_14_cutrope();
        System.out.println(cutrope.cut(8));
    }
}
