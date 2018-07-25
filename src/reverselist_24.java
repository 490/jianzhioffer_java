public class reverselist_24
{
    public listnode rever(listnode head)
    {
        listnode preversehead=null;
        listnode node = head;
        listnode pre = null;
        while(node!=null)
        {
            listnode next = node.next;
            if(next==null)
                preversehead = node;
            node.next = pre;
            pre = node;
            node = next;
        }
        return preversehead;
    }
    public static void main(String[] args)
    {
        reverselist_24 r = new reverselist_24();
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
        list.print(r.rever(p1));
    }
}
