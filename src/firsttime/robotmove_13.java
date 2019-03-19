package firsttime;

public class robotmove_13
{
    public static int test(int m,int n,int k)
    {
        if(m<0||n<0||k<0)
            return 0;
        int[][] visit = new int[m][n];
        int count = movecount(k,m,n,0,0,visit);
        return count;
    }
    public static int movecount(int k,int m,int n,int r,int c,int[][]visit)
    {
        int count=0;
        if(check(k,m,n,r,c,visit))
        {
            visit[r][c]=1;
            count=1+movecount(k,m,n,r,c+1,visit)+
                movecount(k,m,n,r,c-1,visit)+
                movecount(k,m,n,r+1,c,visit)+
                movecount(k,m,n,r-1,c,visit);

        }
        return  count;
    }
    public static boolean check(int k,int m,int n,int r,int c,int[][]visit)
    {
        if(r>=0 && c>=0 && r<m && c<n && (k>=getnum(r)+getnum(c)) && visit[r][c]==0)
        {
            return true;
        }
        return false;
    }
    public static int getnum(int num)
    {
        int count = 0;
        while(num>0)
        {
            count+=num%10;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int m = 9,n=9,k=18;
        System.out.println(test(20,20,15));
    }
}
