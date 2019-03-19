package firsttime;

public class printmatrix_29
{
    public void print(int[][]n)
    {
        int row = n.length-1;
        int col = n[0].length-1;
        int [][]flag=new int[row+1][col+1];
        int i = 0;
        int j = 0;
        int k = 0;
        while(true)
        {
            for (; j <= col - k; j++)
            {
                if(flag[i][j]==-1)
                {
                    return;
                }
                System.out.println(n[i][j]);
                flag[i][j]=-1;
            }
            j--;
            i++;
            for (; i <= row - k; i++)
            {
                if(flag[i][j]==-1)
                {
                    return;
                }
                System.out.println(n[i][j]);
                flag[i][j]=-1;
            }
            i--;
            j--;
            for (; j >= 0 + k; j--)
            {
                if(flag[i][j]==-1)
                {
                    return;
                }
                System.out.println(n[i][j]);
                flag[i][j]=-1;
            }
            j++;
            i--;
            for (; i >= 1 + k; i--)
            {
             //   System.out.println(i+"?"+j);
           //     return;
                if(i<0||j<0||i>row||j>col||flag[i][j]==-1)
                {
                    return;
                }
                System.out.println(n[i][j]);
                flag[i][j]=-1;
            }
            i++;
            j++;
            k++;
        }
    }
    public static void main(String[] args)
    {
        printmatrix_29 p = new printmatrix_29();
        int[][] n1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] n2={{1}};
        int[][] n3={{1,2},{3,4}};
        int[][] n4={{1,2,3,4,5}};
        int[][] n5={{1},{2},{3},{4},{5}};
        int[][] n6={{1,2,3,4},{5,6,7,8}};
        int[][] n7={{1,2},{3,4},{5,6},{7,8}};
        int[][] n8={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        p.print(n2);
    }
}
