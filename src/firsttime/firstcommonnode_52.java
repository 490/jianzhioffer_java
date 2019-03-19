package firsttime;

public class firstcommonnode_52
{
    public int getlen(listnode n)
    {
        int len = 0;
        listnode head = n;
        while(head!=null)
        {
            len++;
            head = head.next;
        }
        return len;
    }
    public void find(listnode n1,listnode n2)
    {
        if(n1==null || n2==null)
            return ;
        int len1 = getlen(n1);
        int len2 = getlen(n2);
        listnode node1 = n1;
        listnode node2 = n2;
        while(len1 > len2)
        {
            node1 = node1.next;
            len1--;
        }
        while(len1 < len2)
        {
            node2 = node2.next;
            len2--;
        }
        while(node1.value!=node2.value && node1!=null && node2!=null)
        {
            node1 = node1.next;
            node2 = node2.next;
        }
        System.out.println(node1.value);
    }

    public static void main(String[] args)
    {
        firstcommonnode_52 f= new firstcommonnode_52();
        listnode l = new listnode();
        listnode n1 = l.create(1);
        listnode n2 = l.create(2);
        listnode n3 = l.create(3);
        listnode n4 = l.create(4);
        listnode n5 = l.create(5);
        listnode n6 = l.create(6);
        listnode n7 = l.create(7);

        l.connect(n1,n2);
        l.connect(n2,n3);
        l.connect(n3,n6);
        l.connect(n6,n7);
        l.connect(n4,n5);
        l.connect(n5,n6);
        f.find(n1,n4);
    }
}
