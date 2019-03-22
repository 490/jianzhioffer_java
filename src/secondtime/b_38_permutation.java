package secondtime;

/**
 * created by zl on 2019/3/22 17:18
 */
public class b_38_permutation
{
    static char[] str={'1','2','3','4','5','6','7','8'};
    public void permutation(int begin)
    {
        int len = str.length;
        if(str == null)
            return;
        if(begin == len)
        {
            if(str[0]+str[1]+str[2]+str[3]==str[4]+str[5]+str[6]+str[7])
                if(str[0]+str[2]+str[4]+str[6]==str[1]+str[5]+str[3]+str[7])
                    if(str[0]+str[1]+str[4]+str[5]==str[2]+str[3]+str[6]+str[7])
                        System.out.println(str);
        }
        else
        {
            for(int i = begin;i < len;i++)
            {
                char tmp = str[i];
                str[i] = str[begin];
                str[begin] = tmp;

                permutation(begin+1);

                tmp = str[i];
                str[i] = str[begin];
                str[begin] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        b_38_permutation b_38_permutation = new b_38_permutation();
        b_38_permutation.permutation(0);
    }
}
