package firsttime;

public class kthfromend_22
{
    public void find(listnode list,int k)
    {
        int n=0;
        if(list==null||k==0)
        {
            System.out.println("null");
            return;
        }
        listnode node = list;
        while(n<k-1)
        {
            //System.out.println(node.value);
            if(node.next!=null)
                node=node.next;
            else
                return;
            n++;
        }
       // System.out.println(n);
        listnode re = list;
        while(node.next!=null)
        {
            node=node.next;
            re=re.next;
        }
            System.out.println(re.value);
    }
    public static void main(String[] args)
    {
        kthfromend_22 k = new kthfromend_22();
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
        k.find(p1,3);
    }
}
