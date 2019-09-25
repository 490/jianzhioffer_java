package secondtime;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * created by zl on 2019/3/25 21:03
 */
public class b_59_1_window
{
    static int[] n = {2,3,4,2,6,2,5,1};
    public ArrayList<Integer> maxinwindow(int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer > deque = new ArrayDeque<>();
        int nsize = n.length;
        if(size < 1||nsize<size ||n==null)
            return list;
        for(int i = 0;i <nsize;i++)
        {
            //队列里存下标，当一个数字的下标和当前处理的下标之差>=size时，滑出。
            //begin=-2,-1,0,1,2,3,4,5...
            int begin = i-size+1;
            if(deque.isEmpty())
                deque.add(i);
            else if(begin > deque.peekFirst())
                deque.pollFirst();

            while(!deque.isEmpty() && n[i] > n[deque.peekLast()])
                deque.pollLast();

            deque.add(i);

            System.out.println("deque="+deque);
            if(begin >= 0)
                list.add(n[deque.peekFirst()]);

        }
        return list;
    }
    public static void main(String[] args) {
        b_59_1_window window = new b_59_1_window();
        System.out.println(window.maxinwindow(3));
    }
}
