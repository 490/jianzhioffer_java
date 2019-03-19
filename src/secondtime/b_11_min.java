package secondtime;

/**
 * created by zl on 2019/3/19 20:40
 */
public class b_11_min
{

    public void find(int[] a,int left,int right)
    {
        if(a == null)
            return;
        int mid = (left+right)/2;
        System.out.println("mid="+mid+",left="+left+",right="+right);
        if(mid==0)
        {
            System.out.println(a[0]);
            return;
        }
        if(a[mid]<a[left] && a[mid]<a[right])
        {
            System.out.println(a[mid]);
            return;
        }
        if(a[mid] > a[left] && a[mid] > a[right])
            find(a,mid,right);
        else{
            find(a,left,mid);
        }
    }
    public static void main(String[] args) {
        b_11_min min = new b_11_min();
        int [] a ={ 3, 4, 5, 1, 2 };

        min.find(a,0,a.length-1);
    }
}
