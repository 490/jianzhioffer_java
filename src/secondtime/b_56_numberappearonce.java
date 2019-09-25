package secondtime;

/**
 * created by zl on 2019/3/25 8:07
 */
public class b_56_numberappearonce
{
    public void find(int[] data,int len)
    {
        if(data==null || len <2)
            return;
        int resultexecOR = 0;
        for(int i = 0;i < len;i++)
        {
            resultexecOR ^= data[i];
        }
        int indexof1 = findfirstbit1(resultexecOR);
        int num1=0,num2=0;
        for(int i = 0;i < len;i++)
        {
            if(isbit1(data[i],indexof1))//根据这位是不是1分为两个数组
                num1 ^= data[i];//把第一个数组全部异或掉，只剩一个
            else
                num2 ^= data[i];
        }
        System.out.println(num1+","+num2);
    }
    boolean isbit1(int datai,int indexof1)
    {
        datai = datai >> indexof1;
        int a = datai & 1;
        if(a!=0)
            return true;
        else
            return false;
    }
    int findfirstbit1(int resultexecuteOR)
    {
        int index = 0;
        while((resultexecuteOR&1)==0)
        {
            resultexecuteOR = resultexecuteOR >>1;
            index++;
        }
        return index;
    }
    public static void main(String[] args) {
        b_56_numberappearonce numberappearonce = new b_56_numberappearonce();
        int [] data = {2,4,3,6,3,2,5,5};
        int len = 8;
        numberappearonce.find(data,len);
    }
}
