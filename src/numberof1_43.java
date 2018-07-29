public class numberof1_43
{
    public int nn(int num)
    {
        int sum=0;
        for(int i = 1 ;i <= num ;i++)
            sum += nn2(i);
        return sum;
    }
    public int nn2(int num)
    {
        int sum=0;
        int nnn=num;
        while(nnn!=0)
        {
            if(nnn%10 == 1 )
                sum++;
            nnn /=10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        numberof1_43 n = new numberof1_43();
        System.out.println(n.nn(12));
    }
}
