package secondtime;

/**
 * created by zl on 2019/3/21 8:58
 */
public class b_24_reverse
{
    public listnode rever(listnode head)
    {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        listnode p = new listnode();
        p.value = head.value;
        p.next = null;
        while(head.next!=null)
        {
            listnode n = new listnode();
            n.value = head.next.value;
            n.next = p;
            p = n;
            head = head.next;
        }
        return p;
    }
    public static void main(String[] args) {
        b_24_reverse r = new b_24_reverse();
        listnode list = new listnode();
        listnode p1 = list.create(1);
        listnode p2 = list.create(2);
       /* listnode p3 = list.create(3);
        listnode p4 = list.create(4);
        listnode p5 = list.create(5);
        listnode p6 = list.create(6);
        listnode p7 = list.create(7);
        listnode p8 = list.create(8);*/

        list.connect(p1,p2);
       /* list.connect(p2,p3);
        list.connect(p3,p4);
        list.connect(p4,p5);
        list.connect(p5,p6);
        list.connect(p6,p7);
        list.connect(p7,p8);*/
        list.print(r.rever(p1));
    }
}
