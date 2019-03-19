package firsttime;

public class leftrotate_58_2
{
    static String s = "abcdefg";
    static char[] str= s.toCharArray();
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
    }
    public void ro(int num)
    {
        int len = str.length-1;
        reverse(0,num-1);
        reverse(num,len);
        reverse(0,len);
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        leftrotate_58_2 l = new leftrotate_58_2();
        reverse_58_1 rr=  new reverse_58_1();

        l.ro(2);
    }

}
