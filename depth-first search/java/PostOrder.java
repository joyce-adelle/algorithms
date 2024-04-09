import java.util.Stack;

public class PostOrder {
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

        traverseRecursive(node.left);
        traverseRecursive(node.right);
        System.out.print(node.val + " ");
    }

    public static void traverseIterative(TreeNode root) {

        if (root == null)
            return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();

            stack2.push(node);
            if (node.left != null)
                stack1.push(node.left);
            if (node.right != null)
                stack1.push(node.right);
        }

        while (!stack2.isEmpty())
            System.out.print(stack2.pop().val + " ");

    }

}

