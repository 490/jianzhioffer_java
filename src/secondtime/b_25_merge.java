package secondtime;

/**
 * created by zl on 2019/3/21 9:13
 */
public class b_25_merge
{
    public listnode merge(listnode list1,listnode list2)
    {

        listnode list3 = new listnode();
        if(list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if(list1.value <= list2.value)
        {
            list3 = list1;
            list3.next = merge(list1.next,list2);
        }
        else if(list2.value < list1.value)
        {
            list3 = list2;
            list3.next = merge(list1,list2.next);
        }

        return list3;
    }
    public static void main(String[] args) {
        b_25_merge r = new b_25_merge();
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
