public class continuous_57_2
{
    public void find(int sum)
    {
        if(sum < 3)
            return;
        int p1 = 1;
        int p2 = 2;
        int mid = (1 + sum)/2;
        int cur = p1 + p2;
        while( p1 < mid)
        {
            if(cur == sum)
                print(p1,p2);
            while(cur > sum && p1 < mid)
            {
                cur -= p1;
                p1++;
                if(cur == sum)
                    print(p1,p2);
            }
            p2++;
            cur += p2;
        }
    }
    public void print(int p1,int p2)
    {
        for(int i = p1;i <=p2;i++)
            System.out.print(i+",");
        System.out.println();
    }
    public static void main(String[] args)
    {
        continuous_57_2 c = new continuous_57_2();
        c.find(15);
    }
}
