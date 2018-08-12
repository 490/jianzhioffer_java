import java.util.ArrayDeque;
import java.util.ArrayList;

public class queuewithmax_59_2
{
    static int[] n = {2,3,4,2,2,5,1};
    public ArrayList<Integer> maxinwindow(int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int nsize = n.length;
        if(size < 1 || nsize <size || n==null)
            return list;
        for(int i = 0; i < nsize;i++)
        {
            int begin = i-size+1;
            if(deque.isEmpty())
                deque.add(i);
            else if(begin > deque.peekFirst())
                deque.pollFirst();
            while(!deque.isEmpty() && n[i]>n[deque.peekLast()])
                deque.pollLast();
            deque.add(i);
            if(begin>=0)
                list.add(n[deque.peekFirst()]);
        }


        return list;
    }
    public static void main(String[] args)
    {
        queuewithmax_59_2 q = new queuewithmax_59_2();
        System.out.println(q.maxinwindow(n.length));
    }
}
