package secondtime;

import java.util.Stack;

/**
 * created by zl on 2019/3/19 19:08
 */
public class b_09_stacktoqueue
{
    static Stack<Character> s1 = new Stack<>();
    static Stack<Character> s2 = new Stack<>();
    public void enq(char a)
    {

        s1.push(a);
    }
    public void deq()
    {
        if(s1.empty() && s2.empty())
            return;
        while(!s1.empty())
        {
            s2.push(s1.pop());
        }
        System.out.println(s2.pop());
        while(!s2.empty())
            s1.push(s2.pop());
    }
    public static void main(String[] args) {
        b_09_stacktoqueue q = new b_09_stacktoqueue();

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
