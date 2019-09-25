package secondtime;

/**
 * created by zl on 2019/3/23 16:51
 */
public class b_42_subarray
{
    public int find(int[]s)
    {
        int[] f = new int[s.length];
        f[0] = s[0];
        int max = 0;
        for(int i = 1;i < s.length;i++)
        {
            if(f[i-1]<=0)
            {
                f[i] = s[i];
            }
            else if(f[i-1]>0)
            {
                f[i] = f[i-1] + s[i];
            }
            if(f[i]>max)
                max = f[i];
        }
        return max;
    }
   /* {
        int i = s.length;
        int k = 0;
        int max = 0;

        while(k<s.length)
        {
            int sum = s[k];
            int j = k+1;
            if(s[k] > 0)
            {
                while(j<s.length)
                {
                    System.out.println("----s[j]="+s[j]);
                    sum += s[j++];
                }
                System.out.println("sum="+sum+",max="+max);
                if(sum>max)
                {
                    max = sum;
                }
            }
            k++;
        }
        return (max);
    }*/

    public static void main(String[] args) {
        b_42_subarray subarray = new b_42_subarray();
        int[] s=new int[]{1,-2,3,10,-4,7,2,-5};
        System.out.println(subarray.find(s));
    }
}
