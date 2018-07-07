import java.util.ArrayList;
import java.util.List;

public class TREE
{
    private int value;
    private List<TREE> child = new ArrayList<>();
    public TREE create(int value)
    {
        TREE tree = new TREE();
        tree.value = value;
        return tree;
    }
    public void connectTreeNode(TREE head,TREE child)
    {
        if(head != null)
            head.child.add(child);
    }
    public void printTreeNode(TREE node)
    {
        if(node != null)
        {
            System.out.print(node.value+"\t");
            for(TREE c : node.child)
            {
                System.out.print(c.value+"\t");
            }
            System.out.println();
        }
        else
            System.out.println("this node is null");
    }
    public void printTree(TREE root)
    {
        printTreeNode(root);

    }
}
