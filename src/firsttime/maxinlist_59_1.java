package firsttime;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class maxinlist_59_1
{
    static int[] n = {2,3,4,2,6,2,5,1};
    public ArrayList<Integer> maxinwindow(int size)
    {
    /*    int nsize= n.length;
        ArrayList<Integer> list = new ArrayList<>();
        if(n == null || size < 1 || n.length <size)
            return list;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int begin;
        for(int i = 0; i < n.length;i++)
        {
            begin = i-size+1;//说明要到窗口大小才为0
            if(deque.isEmpty())
                deque.add(i);
            else if(begin > deque.peekFirst())//当前元素下标 > deque第一个下标 + 窗口大小。
                deque.pollFirst();
            while(!deque.isEmpty() && n[i]>n[deque.peekLast()])//数组当前处理的元素 > deque里最后一个，则把最后一个踢掉。
                deque.pollLast();//一直循环搞，因为deque只放最大值
            deque.add(i);
            if(begin >= 0)//窗口张开了，可以往里放东西了。
                list.add(n[deque.peekFirst()]);
        }
        return list;*/
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
        maxinlist_59_1 m = new maxinlist_59_1();
        System.out.println(m.maxinwindow(3));
    }
}
