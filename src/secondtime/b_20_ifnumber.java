package secondtime;

/**
 * created by zl on 2019/3/21 7:00
 */
public class b_20_ifnumber
{
  /*  public boolean pattern(String str)
    {
        if(str==null || str.length()==0)
            return false;
        return str.matches("[+-]?\\d*(.\\d*)?([eE][+-]?\\d+)?");
     //   return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");

    }*/
    static char[] s;
    static int index;
    public boolean scanUnsigned()
    {
        int pre = index;
        while(index != s.length && s[index]>='0' && s[index]<='9')
        {
            index++;
        }
        //index往后走了说明至少扫到了一个数字
        return pre<index;
    }

    public boolean scanSigned()
    {
        if(index < s.length)
        {
            if(s[index]=='+' ||s[index] == '-')
                index++;
        }
        return scanUnsigned();
    }



    public boolean pattern(String str)
    {
        index = 0;
        s = str.toCharArray();
        if(s == null || s.length == 0)
            return false;
        //一直扫到非数字
        boolean numeric = scanSigned();
        if(index < s.length)
        {
            if(s[index] == '.')
            {
                index++;
                //.后可以是无符号数，或者什么都没有，什么都没有的话就 numeric = numeric
                numeric = scanUnsigned() || numeric;
            }
            //.后有数字再有e
            if(index < s.length)
            {
                if(s[index] == 'e' || s[index] == 'E')
                {
                    index++;
                    //e后必须是无符号整数。
                    numeric = scanSigned() && numeric;
                }
            }
        }
        return numeric && index==s.length;
    }

    public void Test(String name,String str,boolean expect)
    {
        boolean re = pattern(str);
        System.out.println(name+","+re+"...------------result----------"+(re==expect));
    }
    public static void main(String[] args) {
        b_20_ifnumber b_20_ifnumber = new b_20_ifnumber();

        b_20_ifnumber.Test("Test1", "100", true);
        b_20_ifnumber.Test("Test2", "123.45e+6", true);
        b_20_ifnumber.Test("Test3", "+500", true);
        b_20_ifnumber.Test("Test4", "5e2", true);
        b_20_ifnumber.Test("Test5", "3.1416", true);
        b_20_ifnumber.Test("Test6", "600.", true);
        b_20_ifnumber.Test("Test7", "-.123", true);
        b_20_ifnumber.Test("Test8", "-1E-16", true);
        b_20_ifnumber.Test("Test9", "1.79769313486232E+308", true);


        b_20_ifnumber.Test("Test10", "12e", false);
        b_20_ifnumber.Test("Test11", "1a3.14", false);
        b_20_ifnumber.Test("Test12", "1+23", false);
        b_20_ifnumber.Test("Test13", "1.2.3", false);
        b_20_ifnumber.Test("Test14", "+-5", false);
        b_20_ifnumber. Test("Test15", "12e+5.4", false);
        b_20_ifnumber.Test("Test16", ".", false);
        b_20_ifnumber.Test("Test17", ".e1", false);
        b_20_ifnumber.Test("Test18", "e1", false);
        b_20_ifnumber.Test("Test19", "+.", false);
        b_20_ifnumber.Test("Test20", "", false);

    }
}
