public class regular_19
{
    public boolean match(char[] str,char[] pattern)
    {
        if(str==null || pattern ==null)
            return false;
        else
            return matchcore(str,0,pattern,0);


    }
    public boolean matchcore(char[] str,int strindex,char[]pattern,int pindex)
    {
        if(strindex==str.length-1 || pindex==pattern.length-1)
            return true;
        if(strindex!=str.length-1 && pindex==pattern.length-1)
            return false;
        if(pattern[pindex]=='*')
        {

        }
    }
    public void Test(String name,String string,String patten,boolean expect)
    {
        char[] str = string.toCharArray();
        char[] p = patten.toCharArray();
        if(name!=null)
            System.out.println("test "+name);
        if(match(str,p)==true)
            System.out.println("successful");
        else
            System.out.println("error");
    }
    public static void main(String[] args)
    {
        regular_19 r = new regular_19();
        r.Test("Test01", "", "", true);
        r.Test("Test02", "", ".*", true);
        r.Test("Test03", "", ".", false);
        r.Test("Test04", "", "c*", true);
        r.Test("Test05", "a", ".*", true);
        r.Test("Test06", "a", "a.", false);
        r.Test("Test07", "a", "", false);
        r.Test("Test08", "a", ".", true);
        r.Test("Test09", "a", "ab*", true);
        r.Test("Test10", "a", "ab*a", false);
        r.Test("Test11", "aa", "aa", true);
        r.Test("Test12", "aa", "a*", true);
        r.Test("Test13", "aa", ".*", true);
        r.Test("Test14", "aa", ".", false);
        r.Test("Test15", "ab", ".*", true);
        r.Test("Test16", "ab", ".*", true);
        r.Test("Test17", "aaa", "aa*", true);
        r.Test("Test18", "aaa", "aa.a", false);
        r.Test("Test19", "aaa", "a.a", true);
        r.Test("Test20", "aaa", ".a", false);
        r.Test("Test21", "aaa", "a*a", true);
        r.Test("Test22", "aaa", "ab*a", false);
        r.Test("Test23", "aaa", "ab*ac*a", true);
        r.Test("Test24", "aaa", "ab*a*c*a", true);
        r.Test("Test25", "aaa", ".*", true);
        r.Test("Test26", "aab", "c*a*b", true);
        r.Test("Test27", "aaca", "ab*a*c*a", true);
        r.Test("Test28", "aaba", "ab*a*c*a", false);
        r.Test("Test29", "bbbba", ".*a*a", true);
        r.Test("Test30", "bcbbabab", ".*a*a", false);

    }
}
