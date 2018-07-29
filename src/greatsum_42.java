public class greatsum_42
{
    boolean isvalid = true;
    public int find(int[]s)
    {
        int len = s.length;
        if(s==null||len<=0)
            return 0;
        isvalid = false;
        int sum = 0;
        int great = 0x80000000;
        for(int i = 0;i < len;i++)
        {
            if(sum <= 0)
                sum = s[i];
            else
                sum += s[i];
            if(sum > great)
                great = sum;
        }
        return great;
    }
    public static void main(String[] args)
    {
        int[] s=new int[]{1,-2,3,10,-4,7,2,-5};
        greatsum_42 g = new greatsum_42();
        System.out.println(g.find(s));
    }
}
