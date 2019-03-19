package firsttime;

public class print1tomaxa_17
{
    public static char []s;
    public static char[] p(int n)
    {
        int num=0;
        s =new char[n];
        while(!incre(s))
            printf(s);

        return s;
    }
    public static boolean incre(char[] s)
    {
        boolean overflow = false;
        int takeover=0;
        int len=s.length;
        for(int i =len-1;i>=0;i--)
        {
            int sum=s[i]-'0'+takeover;
            if(i==len-1)
                sum++;
          //  System.out.println(i+"......"+sum+"....."+s[i]);
            if(sum>=10)
            {
                if(i==0)
                    overflow=true;
                else
                {
                    sum-=10;
                    takeover=1;
                    s[i]=(char)('0'+sum);
                }
            }
            else
            {
                s[i]=(char)('0'+sum);
                break;
            }
        }
        return overflow;
    }
    public static void xx(int n )
    {
        if(n<=0)
            return;
        char[] number = new char[n];
        for(int i =0;i<10;i++)
        {
            number[i]=(char) ('0'+i);
            recursively(number,n,0);
        }
    }
    public static void recursively(char[] number,int n,int index)
    {
        if(index==n-1)
        {
            printf(number);
            return;
        }
        for(int i=0;i<10;++i)
        {
            number[index+1]=(char)(i+'0');
            recursively(number,n,index+1);
        }
    }
    public static void printf(char[]s)
    {
        boolean begin = true;
        int len = s.length;
        for(int i=0;i<len;++i)
        {
            if(begin&&s[i]!='0')
            {
                begin=false;
            }
            if(begin==false)
                System.out.print(s[i]);
        }
        System.out.print("\t");
    }
    public static void main(String[] args)
    {
        xx(3);
        //System.out.println(xx(3));
    }
}
