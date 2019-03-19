package firsttime;

public class inversepairs_51
{
    public int inverse(int[] data)
    {
        int len = data.length;
        if(data == null || len < 0)
            return 0;
        int[] copy = new int[len];
        for(int i=0;i<len;i++)
            copy[i] = data[i];
        int count = inverse(copy,data,0,len-1);
        return count;
    }
    public int inverse(int[]data,int[]copy,int start,int end)
    {
        if(start == end)
        {
            copy[start] =data[start];
            return 0;
        }
        int len = (end-start)/2;//数组拆成两部分
        int left = inverse(copy,data,start,start+len);
        int right = inverse(copy,data,start+len+1,end);

        int i = start+len;//初始化为 前一个数组最后一个的下标
        int j = end;//后一个数组，的最后一个下标
        int copyindex = end;//复制数组，从后往前，从大到小按序复制
        int count = 0;//逆序对计数
        while(i >= start && j >= start+len+1)
        {
            if (data[i] > data[j])
            {
                copy[copyindex--] = data[i--];//把大数复制到copy数组中，同时下标都左移
                count += j-(start+len+1)+1;//因为排了序。后面的全小于
            }
            else
            {
                copy[copyindex--] = data[j--];
            }
        }
        for(;i >= start;i--)
        {
            copy[copyindex--] = data[i];
        }
        for(;j >= start+len+1;j--)
        {
            copy[copyindex--] = data[j];
        }
        return left+right+count;

    }
    public static void main(String[] args)
    {
        inversepairs_51 i = new inversepairs_51();
        int[] data = new int[]{7,5,6,4};
        System.out.println(i.inverse(data));
    }
}
