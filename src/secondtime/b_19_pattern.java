package secondtime;

/**
 * created by zl on 2019/3/20 21:36
 */
public class b_19_pattern
{
    public boolean match(char[] str,char[] pattern)
    {
        if(str==null || pattern==null)
            return false;
        else
            return core(str,0,pattern,0);
    }
    public boolean core(char[] str,int sindex,char[] pattern,int pindex)
    {
        //str走完了pattern也走完了，为true
        if(sindex >= str.length && pindex >= pattern.length)
            return true;
        //str没走完，但是pattern走完了false
        if(sindex != str.length && pindex >= pattern.length)
            return false;
        //str走完了，pattern没走完；都没走完。
        //pattern有下一位且下一位是*
        if(pindex+1 < pattern.length && pattern[pindex+1] == '*')
        {
            //当前位匹配了，或者当前pattern是万能符，并且当前str没到结尾
            //aac.*
            //aacbb
            if(pattern[pindex] == str[sindex] || str.length!=sindex && pattern[pindex] == '.')
            {
                return core(str,sindex+1,pattern,pindex+2)||//出现1次，相当于跳过*号
                        core(str,sindex+1,pattern,pindex)||//出现多次，pattern不动，str走多步，一个*匹配多个
                        //abcde
                        //a*abcde
                        core(str,sindex,pattern,pindex+2);// 匹配上了，但是很多余，想使其为出现0次
            }else {
                //aabbb
                //aac*b
                return core(str,sindex,pattern,pindex+2);//当前不等，但有*，装作无事发生,此时*的作用是出现0次
            }
        }
        //下一位不是*
        if(pattern[pindex]==str[sindex] || (pattern[pindex]=='.'&& sindex!=str.length))
        {
            return core(str,sindex+1,pattern,pindex+1);
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
        b_19_pattern r = new b_19_pattern();
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
