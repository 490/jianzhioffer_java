package secondtime;

/**
 * created by zl on 2019/3/24 16:12
 */
public class b_52_firstcommonnode
{
    public void find(listnode n1,listnode n2)
    {
        listnode  longlist= n1;
        listnode  shortlist= n2;
        int n1_len = 0;
        int n2_len = 0;
        while(n1.next!=null)
        {
            n1 = n1.next;
            n1_len++;
        }
        while(n2.next!=null)
        {
            n2 = n2.next;
            n2_len++;
        }
        //System.out.println(n1_len+","+n2_len);
        int diff = n1_len>n2_len?(n1_len-n2_len):(n2_len-n1_len);

        if(n1_len<n2_len)
        {
            listnode tmp = shortlist;
            shortlist = longlist;
            longlist = tmp;
        }

        n1 = longlist;
        n2 = shortlist;
        while(diff>0)
        {
            n1 = n1.next;
            diff--;
        }
       // System.out.println("n1.start="+n1.value);
        while(n1!=null && n2!= null&&n1!=n2)
        {
            n1=n1.next;
            n2=n2.next;
        }
        System.out.println(n1.value);
    }
    public static void main(String[] args) {
        b_52_firstcommonnode f = new b_52_firstcommonnode();
        listnode l = new listnode();
        listnode n1 = l.create(1);
        listnode n2 = l.create(2);
        listnode n3 = l.create(3);
        listnode n4 = l.create(4);
        listnode n5 = l.create(5);
        listnode n6 = l.create(6);
        listnode n7 = l.create(7);

        l.connect(n1,n2);
        l.connect(n2,n3);
        l.connect(n3,n6);
        l.connect(n6,n7);
        l.connect(n4,n5);
        l.connect(n5,n6);
        f.find(n1,n4);
    }
}
