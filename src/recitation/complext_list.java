package recitation;

/**
 * created by zl on 2019/3/22 15:38
 */
public class complext_list
{
    int value;
    complext_list next;
    complext_list sibling;
    public complext_list createnode(int value)
    {
        // System.out.println(value);
        complext_list node = new complext_list();
        node.value = value;
        node.next = null;
        node.sibling = null;
        return node;
    }
    public void buildnode(complext_list node, complext_list next, complext_list sibling)
    {
        //System.out.println("---"+node.value);
        if(node!=null)
        {
            node.next = next;
            node.sibling = sibling;
        }
    }
    public void print(complext_list head)
    {
        complext_list node = head;
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
