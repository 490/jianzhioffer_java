import java.util.HashMap;

public class firstnotrepeat_50
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
        firstnotrepeat_50 f= new firstnotrepeat_50();
        f.first(str);
    }

}
