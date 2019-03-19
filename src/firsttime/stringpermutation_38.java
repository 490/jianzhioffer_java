package firsttime;

public class stringpermutation_38
{
    static char[] str={'a','b','c','d'};

    public void p(int begin)
    {
        int len = str.length;
        if(str==null)
            return;
        if(begin == len)
            System.out.println(str);
        else
        {
            for(int i = begin;i < len;i++)
            {
                char tmp = str[i];
                str[i] = str[begin];
                str[begin] = tmp;

                p(begin+1);

                tmp = str[i];
                str[i] = str[begin];
                str[begin] = tmp;
            }
        }

    }
    public static void main(String[] args)
    {
        stringpermutation_38 s = new stringpermutation_38();
        s.p(0);
    }
}
