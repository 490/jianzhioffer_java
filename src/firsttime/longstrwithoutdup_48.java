package firsttime;

import java.util.ArrayList;
import java.util.List;

public class longstrwithoutdup_48
{

    public int find(String s)
    {
       /* int curlen = 0;
        int maxlen = 0;
        int start = 0;
        int[] pos = new int[26];
        for(int i = 0;i < 26;i++)
        {
            pos[i] = -1;
        }
        for(int i = 0;i < str.length();i++)
        {
            int preindex = pos[str.charAt(i)-'a'];
            if(preindex < 0 || i-preindex > curlen)//当前-上一次出现 > 当前最长，说明不影响，+1
            {
                curlen++;
            }
            else
            {
                curlen = i-preindex;//当前记录的长度里出现了这个字母，要缩短至没这个字母之处
                start = i;
            }
            pos[str.charAt(i)-'a'] = i;
            if(curlen > maxlen)
                maxlen = curlen;
        }
        System.out.println(str.substring(start-1,start+maxlen-1));
        return maxlen;*/
        if(s.length()==0){
            return 0;
        }
        int maxLength=1;
        List<Character> list=new ArrayList<Character>();
        list.add(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(list.contains(s.charAt(i)))
            {
                int index=list.indexOf(s.charAt(i));
                list=list.subList(index+1, list.size());
                list.add(s.charAt(i));
//				System.out.println(list);
                maxLength=Math.max(maxLength, list.size());
            }else
                {
                list.add(s.charAt(i));
                maxLength=Math.max(maxLength, list.size());
            }
        }
        System.out.println(list);
        return maxLength;

    }
    public static void main(String[] args)
    {
        longstrwithoutdup_48  l = new longstrwithoutdup_48();
        String s = "arabcacfr";
        System.out.println(l.find(s));
    }
}
