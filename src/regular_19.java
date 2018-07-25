public class regular_19
{
    public boolean match(char[] str,char[] pattern)
    {
        System.out.println(str.length+"_____"+pattern.length);
        if(str==null || pattern ==null)
            return false;
        else
            return matchcore(str,0,pattern,0);


    }
    public boolean matchcore(char[] str,int strindex,char[]pattern,int pindex)
    {
        if(strindex>=str.length || pindex>=pattern.length)
            return true;
        if(strindex!=str.length && pindex>=pattern.length)
            return false;

        if(pindex+1<pattern.length && pattern[pindex+1]=='*')
        {
            if(pattern[pindex]==str[strindex] || (pattern[pindex]=='.' && strindex!=str.length))
            {
                return matchcore(str,strindex+1,pattern,pindex+2)||//出现1次，跳过*号
                        matchcore(str,strindex+1,pattern,pindex)||//出现多次，pattern等着，str往后走可能多步
                        matchcore(str,strindex,pattern,pindex+2);// 出现0次
            }
            else
            {
                return matchcore(str,strindex,pattern,pindex+2);//当前不等，但有*，装作无事发生
            }
        }
        if(pattern[pindex]==str[strindex] || (pattern[pindex]=='.'&& strindex!=str.length))
        {
            return matchcore(str,strindex+1,pattern,pindex+1);
        }
        return false;
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
