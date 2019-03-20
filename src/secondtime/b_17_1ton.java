package secondtime;

import java.util.Map;

/**
 * created by zl on 2019/3/20 18:56
 */
public class b_17_1ton
{
    public void ton(int n)
    {
        if(n <= 0)
            return;
        char[] num = new char[n];
        for(int i = 0;i < 10;i ++)
        {
            num[0] = (char)('0' + i);
            recursive(num,n,0);
        }
    }
    public void recursive(char[] num,int n,int index)
    {
        if(index == n-1)
        {
            print(num);
            return;
        }
        for(int i = 0; i<10;i++)
        {
            num[index+1] = (char)(i+'0');
            recursive(num,n,index+1);
        }
    }
    public void print(char[] s)
    {
        boolean begin = true;
        int len = s.length;
        for(int i = 0;i < len;i++)
        {
            //前面的0不应该打印
            if(begin && s[i]!='0')
            {
                begin = false;
            }
            if(begin == false)
            {
                System.out.print(s[i]);
            }
        }
        System.out.print("\t");
    }

    public static void main(String[] args) {
        b_17_1ton b_17_1ton = new b_17_1ton();
        b_17_1ton.ton(3);
    }
}
