import java.util.*;

public class PreOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        traverseIterative(root);
        System.out.println("");
        traverseRecursive(root);

    }

    public static void traverseRecursive(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " ");
        traverseRecursive(node.left);
        traverseRecursive(node.right);
    }

    public static void traverseIterative(TreeNode root) {

        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }

    }

}
