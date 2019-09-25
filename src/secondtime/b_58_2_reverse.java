package secondtime;

/**
 * created by zl on 2019/3/25 20:52
 */
public class b_58_2_reverse
{
    public void reverse(String s, int n)
    {
        System.out.println(s.substring(n,s.length()-1)+s.substring(0,n));
    }
    public static void main(String[] args) {
        b_58_2_reverse b_58_2_reverse = new b_58_2_reverse();
        b_58_2_reverse.reverse("abcdefg",3);
    }
}
