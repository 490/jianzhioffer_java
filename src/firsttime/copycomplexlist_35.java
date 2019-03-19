package firsttime;

class complexList
{
    int value;
    complexList next;
    complexList sibling;
    public complexList createnode(int value)
    {
       // System.out.println(value);
        complexList node = new complexList();
        node.value = value;
        node.next = null;
        node.sibling = null;
        return node;
    }
    public void buildnode(complexList node,complexList next, complexList sibling)
    {
        //System.out.println("---"+node.value);
        if(node!=null)
        {
            node.next = next;
            node.sibling = sibling;
        }
    }
    public void print(complexList head)
    {
        complexList node = head;
        while(node!=null)
        {
            System.out.println("node:"+node.value);
            if(node.sibling!=null)
                System.out.println("sibling:"+node.sibling.value);
            else
                System.out.println("sibling:null");
            node = node.next;
        }
    }

}
public class copycomplexlist_35
{
    public void cloneNode(complexList head)
    {
        complexList node = head;
        while(node!=null)
        {
           // System.out.println(node.value);
            complexList newnode = new complexList();
            newnode.value = node.value;
            newnode.next = node.next;
            newnode.sibling = null;
            node.next = newnode;
            node = newnode.next;
        }

    }
    public void connectsibling(complexList head)
    {
        complexList node = head;
        while(node!=null)
        {
            complexList newnode = node.next;
            if(node.sibling!=null)
                newnode.sibling = node.sibling.next;
            node = newnode.next;
        }
    }
    public complexList split(complexList head)
    {
        complexList node = head;
        complexList clonehead = null;
        complexList clonenode = null;
        if(node!=null)
        {
            clonehead = clonenode = node.next;
            node.next = clonenode.next;
            node = node.next;
        }

        while(node!=null)
        {

            clonenode.next = node.next;
            clonenode = clonenode.next;
            node.next = clonenode.next;
            node = node.next;
        }
        return clonehead;
    }
    public static void main(String[] args)
    {
        copycomplexlist_35 c = new copycomplexlist_35();
        complexList list = new complexList();
        complexList n1 = list.createnode(1);
        complexList n2 = list.createnode(2);
        complexList n3 = list.createnode(3);
        complexList n4 = list.createnode(4);
        complexList n5 = list.createnode(5);

        list.buildnode(n1,n2,n3);
        list.buildnode(n2,n3,n5);
        list.buildnode(n3,n4,null);
        list.buildnode(n4,n5,n2);

        c.cloneNode(n1);
        c.connectsibling(n1);
        c.split(n1);
        list.print(n1);
    }
}
