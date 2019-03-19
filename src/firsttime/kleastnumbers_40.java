package firsttime;

public class kleastnumbers_40
{

    public  static int partition(int []data,int start,int end)
    {

        int tmp = data[start];
        int i = start;
        int j = end;
        while(i<j)
        {
            while(data[j]>=tmp && i< j)
                j--;
            while(data[i]<=tmp && i<j)
                i++;
            if(i<j)
            {
                int t = data[i];
                data[i]=data[j];
                data[j]=t;
            }
        }
        data[start]=data[i];
        data[i]=tmp;
        return i;
    }
    public static void find(int []data,int k )
    {
        int start = 0;
        int end = data.length-1;
        int mid = (start +end)/2;
        int index = partition(data,0,end);
        while(index !=k-1)
        {
            if(index>k-1)
            {
                end=index-1;
                index=partition(data,0,end);
            }
            if(index<k-1)
            {
                start=index+1;
                index=partition(data,start,end);
            }
        }
        for(int ss = 0;ss<k;ss++)
            System.out.println(data[ss]);
    }
    public static void main(String[] args)
    {
        kleastnumbers_40 k = new kleastnumbers_40();
        int data[] = {4, 5, 1, 6, 2, 7, 3, 8};

        k.find(data,6);
    }
}
