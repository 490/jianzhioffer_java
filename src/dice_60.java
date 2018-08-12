public class dice_60
{
    int maxvalue = 6;
   /* public void print(int num)
    {
        if(num < 1)
            return;
        int max = num * maxvalue;
        int[] prob = new int[max - num +1];
        for(int i = num;i <= max; i++)
        {
            prob[i-num] = 0;
        }
        print(num,prob);
        int total = (int)Math.pow(maxvalue , num);
        double ss = 0;
        for(int i = 3;i <= max;i++)
        {
            double ratio = (double)prob[i-num]/total;
            System.out.println(i+","+ratio);
            ss += ratio;
        }
        System.out.println(ss);
    }
    public void print(int num,int[] prob)
    {
        for(int i = 1;i <= 6;i++)
        {
            print(num,num,i,prob);
        }
    }
    public void print(int original,int cur,int sum,int [] prob)
    {
        if (cur == 1)
            prob[sum - original]++;
        else
        {
            for(int i = 1;i <= 6;i++)
                print(original,cur-1,i+sum,prob);
        }
    }*/
   public void print(int num)
   {
       int[][] p = new int[2][num * 6+1];
       for(int i =0;i < num*6+1;i++)
       {
           p[0][i] = 0;
           p[1][i] = 0;
       }
       int flag=0;
       for(int i = 1;i <= 6;i++)
           p[0][i] = 1;
       for(int numindex = 2;numindex <= num;numindex ++)
       {
           for(int i = 0;i < numindex;i++)
           {
               p[1-flag][i] = 0;
               for(int j = 1;j <=i && j <= 6;j++)
               {
                   p[1-flag][i] += p[flag][i-j];
               }
           }
           flag = 1- flag;
       }
       double total = Math.pow(6,num);
       for(int i = num;i <= 6*num;i++)
       {
           double ratio = (double)p[flag][i]/total;
           System.out.println(i+","+ratio);
       }

   }
    public static void main(String[] args)
    {
        dice_60 d = new dice_60();
        d.print(3);
    }
}
