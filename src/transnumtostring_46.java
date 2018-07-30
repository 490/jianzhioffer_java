public class transnumtostring_46

{
    public int count(int num)

    {
        if (num < 0)
            return 0;
        String str = num + "";
        return count(str);
    }
    public int count(String str)
    {
        int len = str.length();
        int[] count = new int[len];
        int c = 0;
        for(int i = len-1;i >=0 ;i--)
        {
            c = 0;
            if(i < len-1)
            {
                c = count[i+1];

                int digit1 = str.charAt(i) - '0';
                int digit2 = str.charAt(i+1) - '0';
                int convert = digit1*10 + digit2;
                if(convert>=10 && convert<=25)
                {
                    if(i < len-2)
                        c += count[i+2];
                    else
                        c += 1;
                }
            }
            else{
                c = 1;
            }
            count[i] = c;
        }
        c = count[0];
        return c;
    }
    public static void main(String[] args)
    {
        transnumtostring_46 t = new transnumtostring_46();
        System.out.println(t.count(12258));
    }
}
