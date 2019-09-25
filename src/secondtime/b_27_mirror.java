package secondtime;

/**
 * created by zl on 2019/3/21 14:43
 */
public class b_27_mirror
{
    public void mirror(binary_tree root)
    {
        if(root == null)
            return;
        if (root.right == null && root.left == null)
            return;
        binary_tree p = root.left;
        root.left = root.right;
        root.right = p;
        if(root.left!=null)
            mirror(root.left);
        if(root.right!=null)
            mirror(root.right);
    }
    public static void main(String[] args) {

        b_27_mirror b_27_mirror = new b_27_mirror();
        binary_tree tree = new binary_tree();
        binary_tree t1 = tree.createNode(8);
        binary_tree t2 = tree.createNode(8);
        binary_tree t3 = tree.createNode(7);
        binary_tree t4 = tree.createNode(9);
        binary_tree t5 = tree.createNode(2);
        binary_tree t6 = tree.createNode(4);
        binary_tree t7 = tree.createNode(7);
        tree.connectTreeNode(t1,t2,t3);
        tree.connectTreeNode(t2,t4,t5);
        tree.connectTreeNode(t5,t6,t7);
        tree.printTree(t1);
        b_27_mirror.mirror(t1);
        System.out.println("-------------------");
        tree.printTree(t1);
    }
}
