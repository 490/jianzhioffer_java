package secondtime;

/**
 * created by zl on 2019/3/20 20:50
 */
public class b_18_2_deleteduplicate
{
    public listnode delete(listnode head)
    {
        if(head == null|| head.next == null)
            return head;
        listnode next = head.next;
        if(head.value == next.value)
        {
            while(next != null && head.value == next.value)
            {
                next = next.next;
            }
            return delete(next);
        }else{
            //如果没重复，则保留这个head，使其next指向head.next的测试返回结果。
            //然后以head.next作为head开始新的检验。
            head.next = delete(head.next);
            return head;
        }
    }

    public static void main(String[] args) {
        b_18_2_deleteduplicate b_18_2_deleteduplicate = new b_18_2_deleteduplicate();
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
        listnode x = b_18_2_deleteduplicate.delete(p1);
        list.print(x);
    }
}
