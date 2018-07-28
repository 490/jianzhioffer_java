public class mirrortree_27
{
    public void mirror(treenode node)
    {
        if(node==null)
            return;
        if(node.left==null && node.right==null)
            return;
        treenode tmp = node.right;
        node.right = node.left;
        node.left = tmp;
        if(node.left!=null)
            mirror(node.left);
        if(node.right!=null)
            mirror(node.right);
    }

    public static void main(String[] args)
    {
        mirrortree_27 m = new mirrortree_27();

    }
}