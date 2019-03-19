package firsttime;

import java.util.Stack;

class queue
{
    static Stack<Character> stack1 = new Stack<Character>();
    static Stack<Character> stack2 = new Stack<Character>();
    public void enq(char c)
    {
        stack1.push(c);
    }
    public void deq()
    {
        if(stack2.empty())
        {
            while(!stack1.empty())
            {
                stack2.push(stack1.pop());
            }
        }
        if(stack2.empty())
            System.out.println("firsttime.queue is empty");
        System.out.println("deq:"+stack2.pop());
    }

}
public class queuewithtwostack_09
{


    public  static void main (String[] args)
    {
        String str = "abcdefg";
        char[] c = str.toCharArray();
        queue q = new queue();
        q.enq('a');
        q.enq('b');
        q.enq('c');
        q.deq();
        q.enq('d');
        q.deq();
        q.deq();
        q.deq();
        q.deq();
    }
}
