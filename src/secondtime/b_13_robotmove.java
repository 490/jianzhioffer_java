package secondtime;

/**
 * created by zl on 2019/3/20 7:26
 */
public class b_13_robotmove
{
    public int count(int value)
    {
        int num = 0;
        while(value!=0)
        {
            num += value %10;
            value /= 10;
        }
        return num;
    }
    public int move(int k,int m,int n)
    {
        //System.out.println(count(1234));
        if(k<0 || m<0||n<0)
            return 0;
        int[][] visit = new int[m][n];
        int num = next(k,m,n,0,0,visit);
        return num;
    }
    public int next(int k,int m,int n,int i,int j,int[][] visit)
    {
        if(i>=0 && i<m && j>=0 && j<n && count(i)+count(j)<=k && visit[i][j]==0)
        {
            visit[i][j] = 1;
            return 1+next(k,m,n,i+1,j,visit)+
                    next(k,m,n,i-1,j,visit)+
                    next(k,m,n,i,j+1,visit)+
                    next(k,m,n,i,j-1,visit);
        }
        return 0;
    }
    public static void main(String[] args) {
        b_13_robotmove robotmove = new b_13_robotmove();
        System.out.println(robotmove.move(15,20,20));
    }
}
