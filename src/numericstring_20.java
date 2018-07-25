public class numericstring_20
{
    static char [] str;
    static int index=0;
    public boolean scanUnsignedInteger()
    {
        int pre=index;
        while(index!=str.length && str[index]>='0'&& str[index]<='9')
            index++;
        return pre<index;
    }
    public boolean scanInteger()
    {
        if(index<str.length)
        {
            if(str[index]=='+' || str[index]=='-')
                index++;
        }

        return scanUnsignedInteger();
    }
    public boolean check(String s)
    {
         index=0;
        str=s.toCharArray();
        if(str==null)
            return false;
        if(str.length==0)
            return false;
        boolean numeric=scanInteger();//一直扫描到不是数字
       // System.out.println("["+index+"]");
        if( index<str.length)
        {
            if(str[index]=='.')//若. 接下来是小数部分
            {
                index++;
                numeric=scanUnsignedInteger()||numeric;
            }
           // System.out.println("---["+index+"]");
            if( index<str.length)
            {
                if(str[index]=='e'||str[index]=='E')
                {
                    index++;
                    numeric = numeric && scanInteger();
                }
            }

        }
        return numeric && index==str.length;
    }
    public void Test(String name,String str,boolean expect)
    {
        System.out.println(name);
        if(check(str)==expect)
            System.out.println("success");
        else
            System.out.println("error");
    }
    public static void main(String[] args)
    {
        numericstring_20 n = new numericstring_20();
        n.Test("Test1", "100", true);
        n.Test("Test2", "123.45e+6", true);
        n.Test("Test3", "+500", true);
        n.Test("Test4", "5e2", true);
        n.Test("Test5", "3.1416", true);
        n.Test("Test6", "600.", true);
        n.Test("Test7", "-.123", true);
        n.Test("Test8", "-1E-16", true);
        n.Test("Test9", "1.79769313486232E+308", true);


        n.Test("Test10", "12e", false);
        n.Test("Test11", "1a3.14", false);
        n.Test("Test12", "1+23", false);
        n.Test("Test13", "1.2.3", false);
        n.Test("Test14", "+-5", false);
        n.Test("Test15", "12e+5.4", false);
        n.Test("Test16", ".", false);
        n.Test("Test17", ".e1", false);
        n.Test("Test18", "e1", false);
        n.Test("Test19", "+.", false);
        n.Test("Test20", "", false);
    }
}
