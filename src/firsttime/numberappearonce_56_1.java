package firsttime;

public class numberappearonce_56_1
{
    public void findnumsappearonce(int[] data,int len)
    {
        if(data==null || len<2)
            return;
        int resultexecuteOR = 0;
        for(int i = 0;i < len;i++)
        {
            resultexecuteOR ^= data[i];
        }
        int indexof1 = findfirstbit1(resultexecuteOR);
        int num1 = 0,num2 = 0;
        for(int i =0;i < len;i++)
        {
            if(isbit1(data[i],indexof1))//根据这位是不是1分为两个数组
                num1 ^= data[i];//把第一个数组全部异或掉，只剩一个
            else
                num2 ^= data[i];
        }
        System.out.println(num1+"_"+num2);
    }
    public int findfirstbit1(int num)
    {
        int index = 0;
        while(((num&1)==0))
        {
            num = num >> 1;
            index++;
        }
        return index;
    }
    public boolean isbit1(int num,int index)
    {
        num = num >> index;
        int a = num&1;
        if(a!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        int [] data = {2,4,3,6,3,2,5,5};
        int len = 8;
        numberappearonce_56_1 n = new numberappearonce_56_1();
        n.findnumsappearonce(data,len);
    }
}
