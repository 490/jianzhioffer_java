package secondtime;

/**
 * created by zl on 2019/3/24 14:31
 */
public class b_47_maxgift
{
    public void find(int[][] a)
    {
        if(a==null || a.length<=0)
            return;
        int[][] value = new int[a.length][a[0].length];
        value[0][0] = a[0][0];
        for(int i = 1;i<a.length;i++)
            value[i][0] = a[i][0]+value[i-1][0];
        for(int i = 1;i<a[0].length;i++)
            value[0][i] = a[0][i]+value[0][i-1];
        for(int i = 1;i < a.length;i++)
        {
            for(int j = 1 ;j < a[0].length;j++)
            {
                value[i][j] = Math.max(value[i-1][j],value[i][j-1])+a[i][j];
            }
        }
        System.out.println(value[a.length-1][a[0].length-1]);
    }
    public static void main(String[] args) {
        b_47_maxgift maxgift = new b_47_maxgift();
        int a[][] = new int[][]{ { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
        maxgift.find(a);
    }
}
