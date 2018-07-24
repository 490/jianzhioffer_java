
public class deleteduplicate_18_2
{
    public listnode deletedupl(listnode head)
    {
        if(head==null)
            return  null;
        listnode pre = null;
        listnode node = head;
        while(node!=null)
        {
            listnode next = node.next;
            boolean needdel = false;
            if(next!=null && next.value==node.value)
            {
                needdel = true;//当前节点需要删
            }
            if(needdel==false)
            {
                pre=node;//当前节点不需要删，把pre设成当前节点
                node=node.next;
            }
            else
            {
                int value = node.value;
                listnode tobe = node;
                while(tobe!=null&&tobe.value == value)
                {
                    next = tobe.next;
                    tobe=next;
                }
                if(pre==null)//只有前两个节点重复，才会触发）
                {
                    head = next;
                }
                else//
                {
                    pre.next=next;
                }
                node=next;
            }
        }
        return head;
    }
    public static void main(String[] args)
    {
        listnode list = new listnode();


        listnode p1 = list.create(2);
        listnode p2 = list.create(2);
        listnode p3 = list.create(3);
        listnode p4 = list.create(4);
        listnode p5 = list.create(5);
        listnode p6 = list.create(5);
        listnode p7 = list.create(6);


        list.connect(p1,p2);
        list.connect(p2,p3);
        list.connect(p3,p4);
        list.connect(p4,p5);
        list.connect(p5,p6);
        list.connect(p6,p7);
        deleteduplicate_18_2 xx = new deleteduplicate_18_2();
        listnode x = xx.deletedupl(p1);
        list.print(x);
    }
}
