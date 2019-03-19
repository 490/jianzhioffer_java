package firsttime;

public class sortarraytominnumber_45
{
    public void printMin(int[] a)
    {
        int[] clone = a.clone();
        printMinNum(clone,0,clone.length-1);
        for(int i : clone)
        {
            System.out.print(i);
        }
    }
    public void printMinNum(int[] a,int left,int right)
    {
        if(left<right)
        {
            int main_num = a[right];
            int small_curr = left;
            for(int j = left;j < right;j++)
            {
                System.out.println(j);
                if(isSmall(String.valueOf(a[j]),String.valueOf(main_num)))
                {
                    //即 a[j]在左边时，更小
                    System.out.println("---------");
                    int tmp = a[j];
                    a[j] = a[small_curr];
                    a[small_curr] = tmp;
                    small_curr++;
                }
            }
            a[right] = a[small_curr];
            a[small_curr] = main_num;
            printMinNum(a,0,small_curr-1);
            printMinNum(a,small_curr+1,right);
        }
    }
    public boolean isSmall(String m,String n)
    {
        String left = m+n;
        String right = n+m;
        System.out.println(m+"_"+n);
        System.out.println(left+"_..."+right);
        boolean re = false;
        for(int i = 0;i < left.length();i++)
        {
            if(left.charAt(i) < right.charAt(i))
                return true;
            else if(left.charAt(i) > right.charAt(i))
                return false;
        }
        return re;
    }


    public static void main(String[] args)
    {
        sortarraytominnumber_45 s = new sortarraytominnumber_45();
        int[] a ={3,312,32,31,321};
        s.printMin(a);
    }
}
