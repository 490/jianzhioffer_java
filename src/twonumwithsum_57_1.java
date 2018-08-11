public class twonumwithsum_57_1
{
    public void find(int[] data,int sum)
    {
        int len = data.length;
        int p1 = 0;
        int p2 = len-1;
        while(p1< p2 )
        {
            if(data[p1] + data[p2]==sum)
            {
                System.out.println(data[p1]+","+data[p2]);
                break;
            }
            else if(data[p1]+data[p2]>sum)
            {
                p2--;
            }
            else {
                p1++;
            }
        }
    }
    public static void main(String[] args)
    {
        twonumwithsum_57_1 t = new twonumwithsum_57_1();
        int [] data = {1,2,4,7,11,15};
        t.find(data,15);
    }
}

