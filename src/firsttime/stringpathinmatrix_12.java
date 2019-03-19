package firsttime;

public class stringpathinmatrix_12
{
    public static boolean find(char[][] m,char[] str)
    {
        int row = m.length;
        int col = m[0].length;
       // System.out.println(row);
        int visited[][] = new int[row][col];
        int path =0;
        for(int r=0;r<row;r++)
        {
            for(int c =0;c<col;c++)
            {
                if(has(m,str,row,col,r,c,path,visited))
                    return true;
            }
        }
        return false;
    }
    public static boolean has(char[][]m,char[] str,int row,int col ,int r,int c,
                       int path,int[][]visited)
    {
       // System.out.println(path+","+str.length);
        if(path==str.length)
            return true;
        boolean haspath = false;
       // System.out.println(m[r][c]+","+str[path]);
        if(r>=0 && r<row && c>=0 && c<col
                && m[r][c]==str[path] && visited[r][c]==0)
        {
            path++;
            visited[r][c]=1;
            haspath= has(m,str,row,col,r,c-1,path,visited)||
                    has(m,str,row,col,r,c+1,path,visited)||
                    has(m,str,row,col,r-1,c,path,visited)||
                    has(m,str,row,col,r+1,c,path,visited);
            if(haspath==false)
            {
                path--;
                visited[r][c]=0;
            }
        }
        return haspath;
    }

    public static void main(String[] args)
    {
        char[][] matrix={{'a','b','t','g'},
                        {'c','f','c','s'},
                        {'j','d','e','h'}};
        char[] str="bfco".toCharArray();
        System.out.println(find(matrix,str));
    }
}
