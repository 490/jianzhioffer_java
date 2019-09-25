package secondtime;

/**
 * created by zl on 2019/3/25 8:45
 */
public class b_56_onlyappearonce
{
    public int find(int[] data)
    {
        int len = data.length;
        if(data==null || len <=0)
            return -1;
        int []bitsum = new int[32];
        for(int i = 0;i < len;i++)
        {
            int bitmask  = 1;
            for(int j = 31;j>0;j--)
            {
                int bit = data[i] & bitmask;
                if(bit != 0)
                    bitsum[j] += 1;
                bitmask = bitmask << 1;
            }
        }
        int result = 0;
        for(int i =0;i < len;i++)
        {
            result = result << 1;
            result += bitsum[i] %3;
        }
        return result;
    }
    public static void main(String[] args) {
        b_56_onlyappearonce onlyappearonce = new b_56_onlyappearonce();
        int[] data = {1,2,3,1,2,3,1,2,3,4};
        System.out.println(onlyappearonce.find(data));
    }
}
