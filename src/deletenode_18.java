class listnode
{
    int value;
    listnode next;
    public void listnode(int value)
    {
        this.value =value;
        this.next = null;
    }
    public int getValue()
    {
        return this.value;
    }
    public listnode getNext()
    {
        return  this.next;
    }
    public void addtotail(listnode head,int value)
    {

        listnode node = new listnode();
        node.value = value;
        node.next = null;
        if(head == null)
            head=node;
        else {
             while(head.next!=null)
                head=head.next;
             head.next=node;
        }
    }
    public listnode create(int value)
    {
        listnode node = new listnode();
        node.next=null;
        node.value=value;
        return node;
    }
    public void connect(listnode curr,listnode p)
    {
        if(curr == null)
            return;
        curr.next=p;
    }
    public void print(listnode head)
    {
        while(head!=null)
        {
            System.out.print(head.value+"\t");
            head=head.next;
        }
        System.out.println();

    }

}

public class deletenode_18
{
    public void del(listnode head,listnode tobe)
    {
        if(tobe.next!=null)//中间
        {
            listnode next = tobe.next;
            tobe.value = next.value;
            tobe.next = next.next;
        }else if (tobe==head)//删除头
        {
            tobe=null;
            head=null;
        }else//删除尾
        {
            listnode p = head;
            while(p.next!=tobe)
                p=p.next;
            p.next=null;
        }
    }
    public static void main(String[] args)

    {
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

        deletenode_18 de = new deletenode_18();
       // de.del(p1,p1);
        //list.print(p1);

       // de.del(p1,p3);
       // list.print(p1);

        de.del(p1,p6);
        list.print(p1);

        listnode list2 = new listnode();
        list2.create(1);
        de.del(list2,list2);
        list2.print(list2);
    }
}
