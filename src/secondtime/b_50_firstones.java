package secondtime;


import java.util.HashMap;

/**
 * created by zl on 2019/3/24 15:55
 */
public class b_50_firstones
{
    public void first(String str)
    {
        int len = str.length();
        HashMap<Character,Integer> hash = new HashMap();
        for(int i = 0 ;i<len;i++)
        {
            if(hash.containsKey(str.charAt(i)))
                hash.put(str.charAt(i),2);
            else
            {
                hash.put(str.charAt(i),1);
            }
        }
        for(int i=0;i < len;i++)
        {
            if(hash.get(str.charAt(i))==1)
            {
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "";
        b_50_firstones f= new b_50_firstones();
        f.first(str);
    }

}
