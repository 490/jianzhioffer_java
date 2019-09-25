package secondtime;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * created by zl on 2019/3/23 15:10
 */
public class b_41_medianinstream
{
    public static PriorityQueue<Integer> maxheap,minheap;
    public static int num = 0;

    public void addNumber(int value)
    {
        maxheap.add(value);
        System.out.println(minheap);
        System.out.println(maxheap);
        if(num % 2 == 0)
        {
            if(minheap.isEmpty())
            {
                num++;
                return;
            }
            //新插入的值大于min堆的根（最小值），则应该被插到min堆中
            //交换？min堆最小的给max堆
            else if(maxheap.peek() > minheap.peek())
            {
                int maxheap_root = maxheap.poll();
                int minheap_root = minheap.poll();
                System.out.println("maxheap_root="+maxheap_root+",minheap_root="+minheap_root);
                maxheap.add(minheap_root);
                minheap.add(maxheap_root);
                System.out.println(minheap);
                System.out.println(maxheap);
            }
        }
        else
        {
            minheap.add(maxheap.poll());
        }
        num++;
    }

    public int getMedian()
    {
        if(num % 2 ==0)
            return maxheap.peek();
        else
            return (maxheap.peek() + minheap.peek())/2;
    }
    public static void main(String[] args)
    {
        b_41_medianinstream medianinstream = new b_41_medianinstream();

        Comparator<Integer> mycomparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*如果指定的数与参数相等返回0。
                如果指定的数小于参数返回 -1。
                如果指定的数大于参数返回 1
                * */
                return o2.compareTo(o1);
            }
        };


        maxheap = new PriorityQueue<Integer>(20,mycomparator);
        minheap = new PriorityQueue<Integer>(20);


        int a[] = {2,4,6,8,10,5,7,9};
        for(int i =0; i < 8; i++)
        {
            medianinstream.addNumber(a[i]);
           // minheap.add(a[i]);
          //  maxheap.add(a[i]);
          //  System.out.println(minheap);
         //   System.out.println(maxheap);
            System.out.println();
        }
        System.out.println(medianinstream.getMedian());

    }
}
