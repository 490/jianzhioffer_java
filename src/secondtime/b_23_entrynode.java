package secondtime;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zl on 2019/3/21 8:41
 */
public class b_23_entrynode
{

    public void entry(listnode head)
    {
        if(head ==null)
            return;
        Map<listnode,Integer> map = new HashMap<listnode,Integer>();
        while(head.next!=null)
        {
            if(!map.containsKey(head))
            {
                map.put(head,1);
                head = head.next;

            }
            else
            {
                System.out.println(head.value);
                return;
            }
        }
    }
    public static void main(String[] args) {
        b_23_entrynode b_23_entrynode = new b_23_entrynode();
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

        b_23_entrynode.entry(p1);
    }
}
