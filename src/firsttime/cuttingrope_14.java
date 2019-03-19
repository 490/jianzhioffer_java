package firsttime;

public class cuttingrope_14
{
    public static int cut(int m)
    {
        if(m<2)
            return 0;
        if(m==2)
            return 1;
        if(m==3)
            return 2;
        int[] n = new int[m+1];
        n[0]=0;
        n[1]=1;
        n[2]=2;
        n[3]=3;
        int max=0;
        for(int i =4;i<= m;i++)
        {
            max=0;
            for(int j = 1;j<=i/2;j++)
            {
                int p=n[j]*n[i-j];
                if(p>max)
                    max=p;
                n[i]=max;
            }
        }
        max=n[m];
        return max;
    }
    public static void main(String[] args)
    {
        int m=8;
        System.out.println(cut(m));

    }
}
