package secondtime;

/**
 * created by zl on 2019/3/24 15:34
 */
public class b_49_ugly
{
    public int min(int n1,int n2,int n3)
    {
        int min = n1>n2?n2:n1;
        return min>n3?n3:min;
    }
    public int getuglynum(int index)
    {
        if(index<0)
            return 0;
        int num[] = new int[index];
        num[0] = 1;
        int next = 1;
        int min = 0;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        while(next < index)
        {
            min = min(num[p2]*2,num[p3]*3,num[p5]*5);
            num[next] = min;
            while(num[p2]*2 <= num[next])
                p2++;
            while(num[p3]*3 <= num[next])
                p3++;
            while(num[p5]*5 <= num[next])
                p5++;
            next++;
        }
        int ugly = num[index-1];
        return ugly;
    }

    public static void main(String[] args) {
        b_49_ugly ugly = new b_49_ugly();
        System.out.println(ugly.getuglynum(1500));
    }
}
