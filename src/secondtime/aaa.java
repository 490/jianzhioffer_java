package secondtime;

/*华为20190925第三题
#include<stdio.h>
int main()
{
    int n=0;
    scanf("%d",&n);
    for(int i = 0;i < n;i++)
    {

        int power= 0;
        int max=0;
        int day = 0;
        scanf("%d",&day);
        int[day] count ;
        for(int j = 0;j < day;j++)
        {
            int value= 0;
            scanf("%d",&value);
            count[j] = value;

        }
        for(int j = 1;j < day;j++)
        {
            for(int k = 0;k < j;k++)
            {
                if(count[k] < count[j])
                 power ++;
                if(count[k] > count[j])
                 power --;
            }
                max = power>max?power:max;
        }
        printf("%d %d\n",max,power);
    }
}
* */