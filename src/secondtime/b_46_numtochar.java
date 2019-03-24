package secondtime;

/**
 * created by zl on 2019/3/24 9:30
 */
public class b_46_numtochar
{
    public void convert(int n )
    {
        if(n<0)
            return;

        String a = String.valueOf(n);
        int f[] = new int[a.length()];
        f[a.length()-1] = 1;
        if(g(a,a.length()-2)==1)
            f[a.length()-2] = 2;
        else
            f[a.length()-2] = 1;
        for(int i = a.length()-3;i>=0;i--)
        {
            f[i] = f[i+1]+g(a,i)*f[i+2];
        }
        System.out.println(f[0]);
    }
    public int g(String a,int i)
    {
        if((a.charAt(i)=='2' && a.charAt(i+1)<='5')||(a.charAt(i)=='1'))
            return 1;
        else return 0;
    }
    public static void main(String[] args) {
        b_46_numtochar numtochar = new b_46_numtochar();
        numtochar.convert(12258);
    }
}
