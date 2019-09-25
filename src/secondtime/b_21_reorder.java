package secondtime;

/**
 * created by zl on 2019/3/21 8:03
 */
public class b_21_reorder
{
    public void reorder(int[] a)
    {
        int[] n = new int[a.length];
        int before = 0;
        int end = a.length-1;
        for(int i = 0;i < a.length;i++)
        {
            if (a[i]%2 ==1)
                n[before++] = a[i];
            else
                n[end--] = a[i];
        }
        for(int i =0;i < n.length;i++)
            System.out.print(n[i]+" ");
    }
    public static void main(String[] args) {
        b_21_reorder b_21_reorder = new b_21_reorder();
        int a[] = new int []{2, 4, 6, 1, 3, 5, 7};
        b_21_reorder.reorder(a);
    }
}
