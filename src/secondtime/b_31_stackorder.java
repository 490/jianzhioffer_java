package secondtime;

import java.util.Stack;

/**
 * created by zl on 2019/3/21 16:32
 */
public class b_31_stackorder
{
    static int[]push = new int[]{1,2,3,4,5};
    static int[]pop = new int[]{4,5,3,2,1};

    public void isorder()
    {
        int i = 0;
        int j = 0;
        int k = push.length;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(k>0)
        {
            //System.out.println("i="+i+",j="+j);
            while (i < push.length-1&&push[i] != pop[j]  ) {
                s1.push(push[i++]);
            }
            if(i<push.length)
                s1.push(push[i]);
          //  System.out.println("s1="+s1);
            if (j < pop.length && pop[j]==s1.peek()) {
                s1.pop();
                i++;
                j++;
           //     System.out.println("///i="+i+",j="+j);
            }
            k--;
        }
        if (s1.empty())
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String[] args) {
        b_31_stackorder b_31_stackorder = new b_31_stackorder();
        b_31_stackorder.isorder();
    }
}
