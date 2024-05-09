import java.util.*;

public class BinaryTreePathString {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        System.out.println(getPaths(root));
        TreeNode root1 = new TreeNode(12);
        System.out.println(getPaths(root1));

    }

    public static List<String> getPaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if (root == null)
            return result;

        addPath(root, result, new ArrayList<>());

        return result;

    }

    public static void addPath(TreeNode node, List<String> result, List<String> path) {

        if (node == null)
            return;

        path.add(String.valueOf(node.val));

        if (node.left == null && node.right == null)
            result.add(String.join("->", path));

        else {
            addPath(node.left, result, path);
            addPath(node.right, result, path);
        }

        path.remove(path.size() - 1);

    }

}
