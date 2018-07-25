public class entrynodeinlist_23
{
    listnode meetnode(listnode head)
    {
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        listnode p1 = head.next;
        listnode p2 = p1.next;
        while(p1!=null && p2!=null)
        {
            if(p1==p2)
                return p1;
            p1=p1.next;
            p2=p2.next;
            if(p2!=null)
                p2=p2.next;
        }
        return null;
    }
    listnode entry(listnode head)
    {
        listnode meet = meetnode(head);
        if(meet==null)
            return null;
        listnode p3 = meet.next;
        int loop=1;
        while(p3!=meet)
        {
            loop++;
            p3=p3.next;
        }
        //System.out.println(loop);
        //return null;
        listnode p4 = head;
        p3=head;
        while(loop>0)
        {
            p3=p3.next;
            loop--;
        }
        while(p3!=p4)
        {
            p3=p3.next;
            p4=p4.next;
        }
        return p3;
    }

    public static void main(String[] args)
    {
        entrynodeinlist_23 e = new entrynodeinlist_23();
        listnode list = new listnode();
        listnode p1 = list.create(1);
        listnode p2 = list.create(2);
        listnode p3 = list.create(3);
        listnode p4 = list.create(4);
        listnode p5 = list.create(5);
        listnode p6 = list.create(6);
        listnode p7 = list.create(7);
        listnode p8 = list.create(8);

        list.connect(p1,p2);
        list.connect(p2,p3);
        list.connect(p3,p4);
        list.connect(p4,p5);
        list.connect(p5,p6);
        list.connect(p6,p7);
        list.connect(p7,p8);
        list.connect(p8,p8);
        System.out.println(e.entry(p1).value);
    }
}
