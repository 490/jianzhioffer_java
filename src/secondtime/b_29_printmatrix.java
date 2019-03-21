package secondtime;

/**
 * created by zl on 2019/3/21 15:22
 */
public class b_29_printmatrix
{
    public void print(int[][] matrix)
    {
        if(matrix == null)
            return;
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        if(row == 0)
        {
            for(int i = 0;i <= col;i++)
                System.out.print(matrix[0][i]+" ");
            return;
        }
        if(col == 0)
        {
            for(int i = 0;i <= row;i++)
                System.out.print(matrix[i][0]+" ");
            return;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int min = row>col?col:row;
        min++;
       // System.out.println(Math.log(min));
        while(k<=Math.log(min))
        {
            for (j = k; j < col-k; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            for (i = k; i < row-k; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            for (j = col - k; j > 0+k; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            for (i = row - k; i > 0+k; i--) {
                System.out.print(matrix[i][j] + " ");
            }
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        b_29_printmatrix b_29_printmatrix = new b_29_printmatrix();
        int[][] n1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] n2={{1}};
        int[][] n3={{1,2},{3,4}};
        int[][] n4={{1,2,3,4,5}};
        int[][] n5={{1},{2},{3},{4},{5}};
        int[][] n6={{1,2,3,4},{5,6,7,8}};
        int[][] n7={{1,2},{3,4},{5,6},{7,8}};
        int[][] n8={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        b_29_printmatrix.print(n8);

    }
}
