public class minnumberinrotatedarray_11
{
    public void test(int[]a)
    {
        int len = a.length;
        int p1 = 0,p2  = len-1;
        int mid = p1;
        if(len==1)
            System.out.println(a[0]);
       else if(a[0]<a[len-1])
           System.out.println(a[0]);
        else{
            p1=0;
            p2=1;
            while(a[p2]>a[p1])
            {
                p1++;
                p2++;
            }
            System.out.println(a[p2]);
        }

    }
    public  static void main (String[] args)
    {
        int array1[] = { 3, 4, 5, 1, 2 };
        int array2[] = { 3, 4, 5, 1, 1, 2 };
        int array3[] = { 3, 4, 5, 1, 2, 2 };
        int array4[] = { 1, 0, 1, 1, 1 };
        int array5[] = { 1, 2, 3, 4, 5 };
        int array6[] = { 2 };
        minnumberinrotatedarray_11 x = new minnumberinrotatedarray_11();
        x.test(array6);
    }
}
