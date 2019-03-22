package secondtime;

/**
 * created by zl on 2019/3/22 15:37
 */
public class b_35_listcopy
{
    public void cloneNode(complext_list head)
    {
        complext_list node = head;
        while(node!=null)
        {
            complext_list newnode = new complext_list();
            newnode.value = node.value;
            newnode.next = node.next;
            newnode.sibling = null;
            node.next = newnode;
            node = newnode.next;
        }
    }

    public void connectSibling(complext_list head)
    {
        complext_list node = head;
        while(node!=null)
        {
            complext_list newnode = node.next;
            if(node.sibling != null)
                newnode.sibling = node.sibling.next;
            node = newnode.next;
        }
    }

    public complext_list split(complext_list head)
    {
        complext_list node = head;
        complext_list clonehead = null;
        complext_list clonenode = null;
        if(node != null)
        {
            clonehead = clonenode = node.next;
            node.next = clonenode.next;
            node = node.next;
        }

        while(node != null)
        {
            clonenode.next = node.next;
            clonenode = clonenode.next;
            node.next = clonenode.next;
            node = node.next;
        }
        return clonehead;
    }
    public static void main(String[] args) {
        b_35_listcopy b_35_listcopy = new b_35_listcopy();
        complext_list list = new complext_list();
        complext_list n1 = list.createnode(1);
        complext_list n2 = list.createnode(2);
        complext_list n3 = list.createnode(3);
        complext_list n4 = list.createnode(4);
        complext_list n5 = list.createnode(5);

        list.buildnode(n1,n2,n3);
        list.buildnode(n2,n3,n5);
        list.buildnode(n3,n4,null);
        list.buildnode(n4,n5,n2);

        b_35_listcopy.cloneNode(n1);
        b_35_listcopy.connectSibling(n1);
        b_35_listcopy.split(n1);
        list.print(n1);
    }
}
