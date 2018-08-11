import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class maxinlist_59_1
{
    static int[] n = {2,3,4,2,6,2,5,1};
    public ArrayList<Integer> maxinwindow(int size)
    {
        int nsize= n.length;
        ArrayList<Integer> list = new ArrayList<>();
        if(n == null || size < 1 || n.length <size)
            return list;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int begin;
        for(int i = 0; i < n.length;i++)
        {
            begin = i-size+1;
            if(deque.isEmpty())
                deque.add(i);
            else if(begin > deque.peekFirst())
                deque.pollFirst();
            while(!deque.isEmpty() && n[i]>n[deque.peekLast()])
                deque.pollLast();
            deque.add(i);
            if(begin >= 0)
                list.add(n[deque.peekFirst()]);
        }
        return list;
    }
    public static void main(String[] args)
    {
        maxinlist_59_1 m = new maxinlist_59_1();
        System.out.println(m.maxinwindow(3));
    }
}
