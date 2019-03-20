package secondtime;

/**
 * created by zl on 2019/3/20 16:48
 */
public class b_16_exponent
{
    public double power(double base,int exp)
    {
        if(base==0.0 && exp < 0)
            return 0;
        if(exp==0)
            return 1.0;
        else if (exp <0)
            return 1/exe(base,-exp);
        else
            return exe(base,exp);
    }
    public double exe(double base,int exp)
    {
        if(exp==0)
            return 1;
        if(exp==1)
            return base;
        if(exp%2 == 0)
        {
            return exe(base,exp/2)*exe(base,exp/2);
        }else{
            return exe(base,(exp-1)/2)*exe(base,(exp-1)/2)*base;
        }
    }
    public static void main(String[] args) {
        b_16_exponent exponent = new b_16_exponent();
        System.out.println(exponent.power(0,- 4));
    }
}
