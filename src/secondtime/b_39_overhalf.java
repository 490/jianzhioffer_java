package secondtime;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zl on 2019/3/23 14:29
 */
public class b_39_overhalf
{


    public void find(int[] a)
    {
        if(a==null||a.length==0)
            return;
        int len = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < len;i++)
        {
            if(map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if (m.getValue()>len/2)
            {
                System.out.println(m.getKey());
                return;
            }
        }
        System.out.println("none");
    }
    public static void main(String[] args) {
        b_39_overhalf b_39_overhalf = new b_39_overhalf();
          int a1[]={1, 2, 3, 2, 2, 2, 5, 4, 2};
          int a2[]={1, 2, 3, 2, 4, 2, 5, 2, 3};
          int a3[]={2, 2, 2, 2, 2, 1, 3, 4, 5};
          int a4[]={1, 3, 4, 5, 2, 2, 2, 2, 2};
          b_39_overhalf.find(a4);
    }
}
