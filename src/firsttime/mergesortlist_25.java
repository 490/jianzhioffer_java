package firsttime;

public class mergesortlist_25
{
    public listnode merge(listnode head1,listnode head2)
    {
        if(head1==null)
            return head2;
        else if(head2==null)
            return head1;
        listnode newhead = null;

            if(head1.value<=head2.value)
            {
                newhead=head1;
                newhead.next=merge(head1.next,head2);
            }else if(head2.value<head1.value)
            {
                newhead=head2;
                newhead.next=merge(head1,head2.next);
            }

        return newhead;

    }
    public static void main(String[] args)
    {
        mergesortlist_25 r = new mergesortlist_25();
        listnode list = new listnode();
        listnode list2 = new listnode();

        listnode p1 = list.create(1);
        listnode p2 = list2.create(2);
        listnode p3 = list.create(3);
        listnode p4 = list2.create(4);
        listnode p5 = list.create(5);
        listnode p6 = list2.create(6);
        listnode p7 = list.create(7);
        listnode p8 = list2.create(8);

        list.connect(p1,p3);
        list2.connect(p2,p4);
        list.connect(p3,p5);
        list2.connect(p4,p6);
        list.connect(p5,p7);
        list2.connect(p6,p8);

        list.print( r.merge(p1,p2));
    }
}
