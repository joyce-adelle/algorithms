import java.util.*;

public class InOrder {

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
        System.out.print(node.val + " ");
        traverseRecursive(node.right);
    }

    public static void traverseIterative(TreeNode root) {

        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        TreeNode node = root.left;

        while (!stack.isEmpty() || node != null){
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                node = stack.pop();
                System.out.print(node.val + " ");
                node = node.right;
            }

        }

    }

}

