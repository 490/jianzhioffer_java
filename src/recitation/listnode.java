package recitation;

/**
 * created by zl on 2019/3/20 20:46
 */
public class listnode
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

    public void addToTail(listnode head, int value)
    {
        listnode node = new listnode();
        node.value = value;
        node.next = null;
        if(head ==  null)
            head = node;
        else{
            while(head.next != null)
                head = head.next;
            head.next = node;
        }
    }
    public listnode create(int value)
    {
        listnode node = new listnode();
        node.next = null;
        node.value = value;
        return node;
    }

    public void connect(listnode cur, listnode p)
    {
        if(cur == null)
            return;
        cur.next = p;
    }

    public void print(listnode node)
    {
        while(node!=null){
            System.out.print(node.value+"\t");
            node = node.next;
        }
        System.out.println();
    }




}
