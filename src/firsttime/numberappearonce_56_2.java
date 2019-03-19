package firsttime;

public class numberappearonce_56_2
{
    public int find(int[] data,int len)
    {
        if(data == null || len <= 0)
        {
            System.out.println("valid input");
        }
        int[] bitsum = new int[32];
        for(int i = 0 ;i < len;i ++)
        {
            int bitmask = 1;
            for(int j = 31;j >= 0;j--)
            {
                //System.out.println("j="+j+","+data[i]+","+bitmask+","+bitsum[j]);
                int bit = data[i] & bitmask;
                if(bit!=0)
                    bitsum[j] += 1;
                bitmask = bitmask << 1;
            }
        }
        int re = 0;
        for(int i = 0; i<32;i++)
        {
            re = re << 1;
            re += bitsum[i] % 3;
           // System.out.println(bitsum[i]%3);
        }
        return re;
    }
    public static void main(String[] args)
    {
        int[] data = {1,2,3,1,2,3,1,2,3,4};
        numberappearonce_56_2 n  = new numberappearonce_56_2();
        System.out.println(n.find(data,7));
    }
}
