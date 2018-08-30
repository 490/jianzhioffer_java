import java.util.ArrayList;
import java.util.List;

public class lastnumberincircle_62
{
    public void find(int n ,int m)
    {

        if(n <1 || m < 1)
            return ;
        int i =0;
        List<Integer> list = new ArrayList<>();
        for(i = 0;i < n ;i ++)
        {
            list.add(i);
        }
        int count = 0;
        for(i = 0; list.size()>1;i++)
        {
            count++;
            i = i ==list.size()?0:i;
            if(count%m==0)
            {
                System.out.println(list.get(i));
                list.remove(i);
                i--;
            }

        }
        System.out.println(i);

    }
    public void find2(int n,int m)
    {
        if(n<1|m<1)
            return;
        int last = 0;
        for(int i =2;i <=n;i++)
        {
            last = (last+m)%i;
        }
        System.out.println(last);

    }
    public static void main(String[] args)
    {
        lastnumberincircle_62 l = new lastnumberincircle_62();
        l.find2(6,3);
    }
}
