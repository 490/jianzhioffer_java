package secondtime;


/**
 * created by zl on 2019/3/19 21:12
 */
public class b_12_pathinmatrix
{
    static int index=0;
    static char[] str="SLHECCEIDEJFGGFIE".toCharArray();

    static char[][] matrix = {{'A','B','C','E','H','J','I','G'},
                              {'S','F','C','S','L','O','P','Q'},
                              {'A','D','E','E','M','N','O','E'},
                              {'A','D','I','D','E','J','F','M'},
                              {'V','C','E','I','F','G','G','S'}};
    static int[][]flag ;
    public static void core(int i,int j)
    {
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||index>=str.length)
            return;
        System.out.println(i+","+j+","+matrix[i][j]+"___"+index+","+str[index]);

        if (index == str.length-1)
        {
            System.out.println("true");
            return;
        }
        index++;
        if(i<matrix.length && matrix[i+1][j] == str[index])
        {
            core(i+1,j);
        }
        else if(i>1 && matrix[i-1][j] == str[index])
        {
            core(i-1,j);
        }
        else if(j<matrix[0].length && matrix[i][j+1] == str[index])
        {
            core(i,j+1);
        }
        else if(j>1 && matrix[i][j-1] == str[index])
        {
            core(i,j-1);
        }
        else
        {
            index--;
            return;
        }
    }
    public static void find(char[] str)
    {
        //int index =0 ;
        if(matrix ==null || str == null)
            return ;
        for(int i = 0;i < matrix.length;i++)
        {
            for(int j = 0;j < matrix[0].length;j++)
            {
                if(matrix[i][j]==str[index])
                {
                    core(i,j);
                }
            }
        }

    }
    public static void main(String[] args) {

        find(str);
    }
}
