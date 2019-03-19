package firsttime;

public class maxvalueofgift_47
{
    public void find(int[][]a)
    {
        int row = a.length;
        int col = a[0].length;
        int v[][] = new int[row][col];
        v[0][0] = a[0][0];
        for(int i =1;i < row;i++)
            v[i][0] = v[i-1][0] +a[i][0];
        for(int j =1;j < col;j++)
            v[0][j] = v[0][j-1]+a[0][j];
        for(int i = 1;i < row;i++)
        {
            for(int j = 1;j < col;j++)
            {
                v[i][j] = Math.max(v[i-1][j],v[i][j-1]) + a[i][j] ;

             //   System.out.println("i="+i+",j="+j+",v="+v[i][j]);
            }
        }
        System.out.println(v[row-1][col-1]);
    }
    public static void main(String[] args)
    {
        int a[][] = new int[][]{ { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
        maxvalueofgift_47 m = new maxvalueofgift_47();
        m.find(a);
    }
}
