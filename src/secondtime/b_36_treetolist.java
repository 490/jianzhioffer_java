package secondtime;

/**
 * created by zl on 2019/3/22 16:25
 */
public class b_36_treetolist
{
    static binary_tree lastnode = null ;
    public binary_tree convert(binary_tree root)
    {
        convertNode(root);
        binary_tree headnode =  lastnode;
        while(headnode != null && headnode.left != null)
            headnode = headnode.left;
        return headnode;
    }

    public void convertNode(binary_tree root)
    {
        if(root == null)
            return;
        binary_tree cur = root;

        if(cur.left != null)
            convertNode(cur.left);
        //第一次走到这里，cur为4，其left为null
        //第二次是从递归里《退》出来的，cur为6，lastnode是上次递归设置的4
        //第三次是6的递归《进》来的，cur为8，lastnode是6
        cur.left = lastnode;

        if(lastnode != null)
            lastnode.right = cur;
        lastnode = cur;

        if (cur.right != null)
            convertNode(cur.right);
    }

    public void print(binary_tree head)
    {
        binary_tree node = head;
        System.out.println("→:");
        while(node != null)
        {
            System.out.print("\t"+node.value);
            if(node.right== null)
                break;
            node = node.right;
        }
        System.out.println("\n←:");
        while(node != null)
        {
            System.out.print("\t"+node.value);
            if(node.left == null)
                break;
            node = node.left;
        }
    }

    public static void main(String[] args) {
        b_36_treetolist c = new b_36_treetolist();
        binary_tree t = new binary_tree();
        binary_tree t1 = t.createNode(10);
        binary_tree t2 = t.createNode(6);
        binary_tree t3 = t.createNode(14);
        binary_tree t4 = t.createNode(4);
        binary_tree t5 = t.createNode(8);
        binary_tree t6 = t.createNode(12);
        binary_tree t7 = t.createNode(16);

        t.connectTreeNode(t1,t2,t3);
        t.connectTreeNode(t2,t4,t5);
        t.connectTreeNode(t3,t6,t7);
        c.print(c.convert(t1));
    }
}
