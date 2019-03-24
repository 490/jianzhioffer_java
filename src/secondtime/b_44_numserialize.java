package secondtime;

import java.util.Map;

/**
 * created by zl on 2019/3/24 8:01
 */
public class b_44_numserialize
{
    public int find(int index)
    {
        if (index < 0)
            return -1;
        int digit = 1;
        while(true)
        {
            //digit位数有几个
            int number = countOfInteger(digit);
            if(index < number*digit)
                return digitAtIndex(index,digit);
            index -= digit*number;
            digit++;
        }
    }
    public int digitAtIndex(int index,int digit)
    {
        int number = beginNumber(digit)+index/digit;
        int indexfromright= digit-index%digit;
        System.out.println("indexfromright="+indexfromright);
        for(int i =1;i<indexfromright;i++)
        {
            number/=10;
            System.out.println("num="+number);
        }
        return number%10;
    }
    int beginNumber(int digit)
    {
        if(digit ==1 )
            return 0;
        else
            return (int)Math.pow(10,digit-1);
    }
    int countOfInteger(int n)
    {
        if(n == 1)
            return 10;
        else
            return  (int)(9*Math.pow(10,n-1));
    }
    public static void main(String[] args) {
        b_44_numserialize numserialize = new b_44_numserialize();
        System.out.println(numserialize.find(1001));
    }
}
