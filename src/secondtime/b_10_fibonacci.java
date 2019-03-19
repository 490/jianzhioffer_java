package secondtime;

/**
 * created by zl on 2019/3/19 20:01
 */
public class b_10_fibonacci
{
    public void fibo(int n )
    {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2;i <= n;i++)
        {
            f[i] = f[i-1] + f[i-2];
            System.out.println(i+","+f[i]);
        }
        System.out.println(f[n]);
    }
    public static void main(String[] args) {
        b_10_fibonacci fibonacci = new b_10_fibonacci();
        fibonacci.fibo(40);
    }
}
