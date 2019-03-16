public class lastnumberincircle_62
{
    public int circle(int n,int m)
    {

        if(n<1||m<1)
            return -1;
        int last=0;
        for(int i = 2;i <= n;i++)
        {
            last = (last+m)%i;
            System.out.println("last="+last);
        }
        return last;
    }
    public int circle2(int n,int m)
    {
        if(n==1)
            return 0;
        else
        {
            return (circle2(n-1,m)+m)%n;
        }
    }
    public static void  main(String[] args)
    {
        lastnumberincircle_62 l = new lastnumberincircle_62();
        System.out.println(l.circle2(4000,997));
    }
}
