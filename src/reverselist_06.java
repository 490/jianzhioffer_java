import java.util.Stack;

class Node
{
    private int value;
    private Node next;
    public void Node(int value)
    {
        this.value = value;
        this.next = null;
    }
    public int getValue()
    {
        return this.value;
    }
    public Node getNext(Node node)
    {
        return node.next;
    }
    public void addNodetoTail(Node head,int value)
    {
        Node node = new Node();
        node.next = null;
        node.value = value;
        if(head == null)
            head = node;
        else
        {
            while(head.next!=null)
                head = head.next;
            head.next = node;
        }
    }
    public Node create(int value)
    {
        Node node = new Node();
        node.next = null;
        node.value = value;
        return node;
    }
    public void connect(Node cur,Node p)
    {
        if(cur == null)
            return;
        cur.next = p;
    }
    public void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.value+"\t");
            head = head.next;
        }
        System.out.println();
    }
    public void removeNode()
    {

    }
}
public class reverselist_06
{
    public void test()
    {

    }
    public void iteratively(Node head)
    {
        Stack<Node> stack = new Stack<>();
        Node h = head;
        while(h!=null)
        {
            stack.push(h);
            h=h.getNext(h);
        }
        while(!stack.empty())
        {
            head = stack.pop();
            System.out.print(head.getValue()+"\t");
        }
        System.out.println();

    }
    public void recursively(Node head)
    {
        if(head == null)
        {
            return;
        }
        if(head.getNext(head)!=null)
            recursively(head.getNext(head));
        System.out.print(head.getValue()+"\t");

    }
    public static void main(String[] args)
    {
        Node n =new Node();
        Node n1 = n.create(1);
        Node n2 = n.create(2);
        Node n3 = n.create(3);
        n.connect(n1,n2);
        n.connect(n2,n3);
        n.printList(n1);

        reverselist_06 r = new reverselist_06();
        r.iteratively(n1);
        System.out.println("-------------------");
        r.recursively(n1);
    }
}
