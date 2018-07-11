public class power_16
{
    static boolean flag;
    public static boolean equal(double num1,double num2)
    {
        if(num1-num2>-0.0000001 &&num1-num2<0.0000001)
            return true;
        else
            return false;
    }
    public static double power(double base,double exp)
    {
        double r =0;
        if(equal(base,0.0) && exp<0)
        {
            flag=false;
            return 0.0;
        }
        int absexp=Math.abs((int)exp);
        r=func(base,absexp);
        if(exp<0)
            r=1.0/r;
        return r;

    }
    public static double func(double base,int absexp)
    {
        if(absexp==0)
            return 1;
        if(absexp==1)
            return base;
        double r = func(base,absexp>>1);
        r*=r;
        if((absexp&0x1)==1)
            r*=base;
        return r;
    }
    public static void main(String[] args)
    {
        System.out.println(power(2,-3));
    }
}
