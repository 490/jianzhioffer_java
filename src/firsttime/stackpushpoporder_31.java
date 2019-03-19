package firsttime;

import java.util.Stack;

public class stackpushpoporder_31
{
    static int[]push = new int[]{1,2,3,4,5};
    static int[]pop = new int[]{4,3,5,1,2};
    public void order()
    {
        int len=push.length;
        boolean is = false;
        if(pop!=null && push!=null && len>0)
        {
            int nextpop = 0;
            int nextputh = 0;
            Stack<Integer> stack = new Stack<>();
            while(nextpop  < len)
            {
                while(stack.empty() || stack.peek()!=pop[nextpop])
                {
                    if(nextputh == len)
                        break;
                    stack.push(push[nextputh]);
                    nextputh++;
                }
                if(stack.peek()!=pop[nextpop])
                    break;
                stack.pop();
                nextpop++;
            }
            if(stack.empty() && nextpop==len)
                is = true;
        }
         System.out.println(is);
    }
    public static void main(String[] args)
    {
        stackpushpoporder_31 s = new stackpushpoporder_31();
        s.order();
    }
}
