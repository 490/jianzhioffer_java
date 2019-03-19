package firsttime;

public class maxprofit_63
{
    int[] price = new int[]{9,11,8,5,7,12,16,14};
    public int max()
    {
        int len = price.length;
        if(len<2)
            return 0;
        int min = price[0];
        int maxdiff = price[1]-min;
        for(int i = 2;i<len;i++)
        {
            if(price[i-1]<min)
                min = price[i-1];
            if(maxdiff < price[i]-min)
                maxdiff = price[i]-min;
        }
        return maxdiff;
    }
    public static void main(String [] args)
    {
        maxprofit_63 m = new maxprofit_63();
        System.out.println( m.max());
    }
}
