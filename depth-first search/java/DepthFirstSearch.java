
public class DepthFirstSearch {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        traverse(root);

    }

    public static void traverse(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " ");
        traverse(node.left);
        traverse(node.right);
    }

}
