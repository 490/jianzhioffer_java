package recitation;

/**
 * created by zl on 2019/3/26 15:16
 */
public class c_12_pathinmatrix {
    static char[] str = "SLHECCEIDEJFGGFIE".toCharArray();
    static char[][] matrix = {{'A', 'B', 'C', 'E', 'H', 'J', 'I', 'G'},
            {'S', 'F', 'C', 'S', 'L', 'O', 'P', 'Q'},
            {'A', 'D', 'E', 'E', 'M', 'N', 'O', 'E'},
            {'A', 'D', 'I', 'D', 'E', 'J', 'F', 'M'},
            {'V', 'C', 'E', 'I', 'F', 'G', 'G', 'S'}};
/* static  char[][] matrix={{'a','b','t','g'},
          {'c','f','c','s'},
          {'j','d','e','h'}};
    static char[] str="bfco".toCharArray();*/

    public  boolean find() {

        int row = matrix.length;
        int col = matrix[0].length;
        int visited[][] = new int[row][col];
        int len = str.length;
        int index = 0;
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(matrix[i][j]==str[index])
                {
                    if (core(visited,row,i,col,j,index))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean core(int[][] visited, int row, int r, int col, int c, int index)
    {
        if(index == str.length)
            return true;
        boolean has = false;
        if(r>=0 && r<row && c>=0 && c<col && visited[r][c]==0 && matrix[r][c] == str[index])
        {
            visited[r][c] = 1;
            index++;
            has = core(visited,row,r+1,col,c,index)||
                    core(visited,row,r,col,c+1,index)||
                    core(visited,row,r-1,col,c,index)||
                    core(visited,row,r,col,c-1,index);
            if(has==false)
            {
                index--;
                visited[r][c] = 0;
            }
        }
        return has;
    }
    public static void main(String[] args) {

        c_12_pathinmatrix pathinmatrix = new c_12_pathinmatrix();
        System.out.println(pathinmatrix.find());
    }
}
