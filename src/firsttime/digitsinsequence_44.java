package firsttime;

public class digitsinsequence_44
{
    public int digitAtindex(int index)
    {
        if(index < 0)
            return -1;
        int digit = 1;
        while(true)
        {
            int numbers = count_of_int(digit);
            //一位数、两位数、3位数的数量。。。
            //num * d= x位数占据多少位
            if(index < numbers*digit)
                return digitAtindex(index,digit);
            index -= digit*numbers;
            digit++;
        }
    }
    public int digitAtindex(int index,int digit)
    {
        //digit 位数，index是剩下的在这么多位里
        int num = begin(digit) + index/digit;
        int intdexfromright = digit - index%digit;
        for(int i = 1;i < intdexfromright;i++)
        {
            num /= 10;
        }
        return num%10;
    }
    public int count_of_int(int digit)
    {
        if(digit==1)
            return 10;
        int count = (int)(Math.pow(10,digit-1));
        return 9*count;
    }
    public int begin(int digit)
    {
        if(digit==1)
            return 0;
        return (int)(Math.pow(10,digit-1));
    }
    public static void main(String[] args)
    {
        digitsinsequence_44 d = new digitsinsequence_44();
        System.out.println(d.digitAtindex(1001));
    }
}
