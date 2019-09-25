package recitation;

/**
 * created by zl on 2019/3/26 14:23
 */
public class c_08_nextnode
{
    public binary_tree_withparent nextNode(binary_tree_withparent node)
    {
        if(node == null)
            return null;

        else if(node.right!=null)
        {
            node  = node.right;
            while(node.left != null)
                node = node.left;
            return node;
        }
        else if(node.parent != null )
        {
            if(node == node.parent.left)
                return node.parent;
            while(node.parent != null && node == node.parent.right)
                node = node.parent;
            return node;
        }
        return null;
    }
    public static void main(String[] args) {
        c_08_nextnode nextnode = new c_08_nextnode();
        binary_tree_withparent x = new binary_tree_withparent();
        binary_tree_withparent pNode8 = x.create(8);
        binary_tree_withparent pNode6 = x.create(6);
        binary_tree_withparent pNode10 = x.create(10);
        binary_tree_withparent pNode5 = x.create(5);
        binary_tree_withparent pNode7 = x.create(7);
        binary_tree_withparent pNode9 = x.create(9);
        binary_tree_withparent pNode11 = x.create(11);

        x.connect(pNode8, pNode6, pNode10);
        x.connect(pNode6, pNode5, pNode7);
        x.connect(pNode10, pNode9, pNode11);

        x.printNode(nextnode.nextNode(pNode8));
    }
}
