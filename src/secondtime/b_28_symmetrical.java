package secondtime;

/**
 * created by zl on 2019/3/21 15:10
 */
public class b_28_symmetrical
{
    static StringBuilder sbpost = new StringBuilder();
    static StringBuilder sbpre = new StringBuilder();
    public void postscan(binary_tree root)
    {
        if (root == null)
            return ;
        sbpost.append(root.value);
        if (root.right != null)
            postscan(root.right);
        if (root.left != null)
            postscan(root.left);
    }
    public void prescan(binary_tree root)
    {
        if (root == null)
            return ;
        sbpre.append(root.value);
        if (root.left != null)
            prescan(root.left);
        if (root.right != null)
            prescan(root.right);

    }
    public static void main(String[] args) {
        b_28_symmetrical b_28_symmetrical  = new b_28_symmetrical();
        binary_tree tree = new binary_tree();
        binary_tree t1 = tree.createNode(8);
        binary_tree t2 = tree.createNode(6);
        binary_tree t3 = tree.createNode(6);
        binary_tree t4 = tree.createNode(5);
        binary_tree t5 = tree.createNode(7);
        binary_tree t6 = tree.createNode(7);
        binary_tree t7 = tree.createNode(5);
        tree.connectTreeNode(t1,t2,t3);
        tree.connectTreeNode(t2,t4,t5);
        tree.connectTreeNode(t3,t6,t7);
        b_28_symmetrical.postscan(t1);
        b_28_symmetrical.prescan(t1);
        System.out.println(sbpost.toString().equals(sbpre.toString()));
    }
}
