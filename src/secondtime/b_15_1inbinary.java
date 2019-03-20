package secondtime;

/**
 * created by zl on 2019/3/20 8:59
 */
public class b_15_1inbinary
{
    public int count(long n)
    {
        System.out.println("n="+n);
        int num = 1;
        int count  = 0;
        if(n<0)
            n *= -1;
        System.out.println(Integer.MAX_VALUE+".,"+Integer.MIN_VALUE);
        while(num<=n && num<Integer.MAX_VALUE && num>Integer.MIN_VALUE)
        {
            System.out.println(num+","+n);
            if((num & n) != 0)
                count ++;
            num = num<<1;
        }
        return count;
    }
    public static void main(String[] args) {
        b_15_1inbinary b_15_1inbinary = new b_15_1inbinary();
        System.out.println(b_15_1inbinary.count(0x80000000L));

    }
}
