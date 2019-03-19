package secondtime;


/**
 * created by zl on 2019/3/19 21:12
 */
public class b_12_pathinmatrix
{
   static char[] str="SLHECCEIDEJFGGFIE".toCharArray();
    static char[][] matrix = {{'A','B','C','E','H','J','I','G'},
                              {'S','F','C','S','L','O','P','Q'},
                              {'A','D','E','E','M','N','O','E'},
                              {'A','D','I','D','E','J','F','M'},
                              {'V','C','E','I','F','G','G','S'}};
/* static  char[][] matrix={{'a','b','t','g'},
          {'c','f','c','s'},
          {'j','d','e','h'}};
    static char[] str="bfco".toCharArray();*/

    public static boolean find()
    {
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] visited = new int[row][col];
        int index=0;
        for(int r = 0; r < row;r++)
        {
            for(int c =0;c < col;c++)
            {
                if(has(row,col,r,c,index,visited))
                    return true;
            }
        }
        return false;
    }
    public static boolean has(int row,int col,int r,int c,int index,int[][]visited)
    {
        if(index == str.length)
            return true;
        boolean haspath = false;

        if(r>=0 && r<row && c>=0 && c<col && visited[r][c]==0  && matrix[r][c] == str[index])
        {
            visited[r][c] = 1;
            index ++ ;
            haspath = has(row,col,r,c+1,index,visited)||
                    has(row,col,r,c-1,index,visited)||
                    has(row,col,r+1,c,index,visited)||
                    has(row,col,r-1,c,index,visited);
            if(haspath==false)
            {
                index--;
                visited[r][c] = 0;
            }
        }
        return haspath;
    }
    public static void main(String[] args) {

        System.out.println(find());
    }
}
