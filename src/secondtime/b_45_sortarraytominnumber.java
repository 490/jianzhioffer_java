package secondtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * created by zl on 2019/3/24 8:51
 */
public class b_45_sortarraytominnumber
{
    public void printMin(int [] a)
    {
       if(a==null || a.length==0)
           return;
        ArrayList<String>arrayList = new ArrayList<>();
        for(int j =0;j < a.length;j++)
        {
            arrayList.add(String.valueOf(a[j]));
        }
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                //s1>s2 return 1
                return s1.compareTo(s2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        b_45_sortarraytominnumber s= new b_45_sortarraytominnumber();
        int[] a ={3,312,32,31,321};
        s.printMin(a);
    }
}
