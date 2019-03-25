package secondtime;

import java.util.Iterator;
import java.util.Stack;

/**
 * created by zl on 2019/3/25 9:51
 */
public class b_58_reverse
{
    public void rev(String s)
    {
        int len = s.length()-1;
        Stack<String> stack = new Stack<>();
        for(int i = 0;i <= len;i++)
        {
            int j = i;
            int flag = 0;
            String ch="" ;
            while(j<=len&&s.charAt(j)!=' ')
            {
               if (j==len)
               //    System.out.println(s.charAt(j)+"fff");
                   flag=1;
                j++;
            }
            stack.push(s.substring(i,j));
            if(flag==0)
            {
                ch = s.substring(j,j+1);

                stack.push(ch);
            }
            i=j;
        }
        while (!stack.empty()) {
           System.out.print(stack.pop());
        }
    }
    public static void main(String[] args) {
        b_58_reverse reverse = new b_58_reverse();
        String s = "i am a stu.";
        reverse.rev( s);
    }
}
