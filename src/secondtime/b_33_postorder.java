package secondtime;

import java.util.LinkedList;

/**
 * created by zl on 2019/3/22 7:07
 */
public class b_33_postorder
{
    public boolean order(int[] str,int start,int end)
    {
        if (str==null || str.length==0)
            return false;
        if(start<0||end<0||start>str.length-1||end>str.length-1)
            return true;
        int root = str[end];
        int index = 0;
        while(str[index] < root)
            index++;
        //System.out.println(str[index]);
        int first = index;
        while(index<end)
        {
            if(str[index] < root)
                return false;
            index++;
        }
        //System.out.println(index);
        return order(str,0,first-1) && order(str,first,end-1);
    }
    public static void main(String[] args)
    {
         int [] str = new int[]{4, 6, 12, 8, 16, 14, 10};
         b_33_postorder b_33_postorder = new b_33_postorder();
        System.out.println(b_33_postorder.order(str,0,str.length-1));
    }
}
