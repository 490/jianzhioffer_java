package secondtime;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zl on 2019/3/24 15:17
 */
public class b_48_maxnodupli
{
    public int find(String s)
    {
       /* Map<Character,Integer> map = new HashMap<>();
        int len = 0;
        int max = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),i);
                len++;
             //   System.out.println("char="+s.charAt(i)+",len="+len);
            }else
            {
                i = map.get(s.charAt(i));
                map.clear();
                len = 0;

            }
            if(max < len)
                max = len;

        }
        return max;*/
       //ans存放当前最大值，j代表当前计数的子串是从左边第几位开始的，array存这个字符最后一次出现的位置
        int length = s.length(), ans = 0;
        int[] array = new int[128];
        for (int i = 0, j = 0; i < length; i++)
        {
            j = Math.max(array[s.charAt(i)], j);
            ans = Math.max(ans, i - j + 1);
            array[s.charAt(i)] = i + 1;
        }
        return ans;

    }
    public static void main(String[] args) {
        b_48_maxnodupli m = new b_48_maxnodupli();
        String s = "arabcacfr";
        System.out.println(m.find(s));
    }
}
