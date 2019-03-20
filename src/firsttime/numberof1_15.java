package firsttime;

public class numberof1_15
{
    public static int sum(int num)
    {
        int r = 0;
        int flag=1;
        while(flag>0)
        {
            int x =num&flag;
            System.out.println("flag="+Integer.toBinaryString(flag));

            System.out.println(Integer.toBinaryString(num)+"___"+x);

            if(x>0)
            {
                r++;
                System.out.println(r);
            }
            flag = flag<<1;
            System.out.println(flag>0);
            System.out.println("-------------------");
        }
        return r;
    }
    public static int sum2(int num)
    {
        int r=0;
        while(num>0)
        {
            r++;
            num=(num-1)&num;
        }
        return r;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(0x7FFFFFFF));
    }
}
