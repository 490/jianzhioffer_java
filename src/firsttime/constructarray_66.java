package firsttime;

public class constructarray_66
{
    int[] a = new int[]{1,-2,3,-4,5};
    public void construct()
    {
        int[] b = new int[a.length];
        b[0] = 1;
        for(int i = 1; i < a.length;i++)
        {
            b[i] = b[i-1] * a[i-1];
        }
        int tmp = 1;
        for(int i = a.length-2;i >= 0;i--)
        {
            tmp *= a[i+1];
            b[i] *= tmp;
        }
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
    }
    public static void main(String [] args)
    {
        constructarray_66 c= new constructarray_66();
        c.construct();
    }
}
