
public class TreePathSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        System.out.println(hasPathSum(root, 23));
        System.out.println(hasPathSum(root, 16));

    }

    public static boolean hasPathSum(TreeNode node, int sum) {
        if (node == null)
            return false;

        if (node.val == sum && node.left ==  null && node.right == null)
            return true;

        // System.out.print(node.val + " ");
        return hasPathSum(node.left, sum - node.val) || hasPathSum(node.right, sum - node.val);
    }

}
