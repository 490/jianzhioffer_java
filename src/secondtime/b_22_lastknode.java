package secondtime;

/**
 * created by zl on 2019/3/21 8:11
 */
public class b_22_lastknode
{
    public void find(listnode head,int k)
    {
        if(head == null)
            return;
        if(k <= 0)
        {
            System.out.println("k must >0");
            return;
        }
        listnode p1 = head;

        listnode p2 = head;
        while(k-->1 && p2.next!=null)
        {
            p2 = p2.next;
        }
        while(p2.next!=null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println(p1.value);
    }
    public static void main(String[] args) {
        b_22_lastknode b_22_lastknode = new b_22_lastknode();
        listnode list = new listnode();
        listnode p1 = list.create(1);
        listnode p2 = list.create(2);
        listnode p3 = list.create(3);
        listnode p4 = list.create(4);
        listnode p5 = list.create(5);
        listnode p6 = list.create(6);

        list.connect(p1,p2);
        list.connect(p2,p3);
        list.connect(p3,p4);
        list.connect(p4,p5);
        list.connect(p5,p6);
        b_22_lastknode.find(p1,4);
    }
}
