package firsttime;

public class reverse_58_1
{
    static String s = "i am a student.";
    static char[] str = s.toCharArray();
    public void reverse(int p1,int p2)
    {
        while(p1 < p2)
        {
            char tmp = str[p1];
            str[p1] = str[p2];
            str[p2] = tmp;
            p1++;
            p2--;
        }
    }
    public void r()
    {
        int len = str.length-1;
        reverse(0,len);
        int begin = 0,end = 0;
        while(begin<len)
        {
            if(str[begin] == ' ')
            {
                begin++;
                end++;
            }
            else if(str[end] == ' '||end==len)
            {
                reverse(begin,end-1);
                begin = end;
            }
            else
                end++;
        }
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        reverse_58_1 rr=  new reverse_58_1();
        rr.r();
    }

}
