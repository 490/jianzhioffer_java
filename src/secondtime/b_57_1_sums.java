package secondtime;

/**
 * created by zl on 2019/3/25 9:23
 */
public class b_57_1_sums
{
    public void find(int [] data,int s)
    {
        int p1 = 0,p2=data.length-1;
        while(p1!=p2)
        {
            if(data[p1]+data[p2] == s)
            {
                System.out.println(data[p1]+","+data[p2]);
                return;
            }
            else if(data[p1]+data[p2] > s)
                p2--;
            else if (data[p1]+data[p2] < s)
                p1++;
        }
        System.out.println("none");
    }
    public static void main(String[] args) {
        int [] data = {1,2,4,7,11,15};
        b_57_1_sums t = new b_57_1_sums();
        t.find(data,15);
    }
}
