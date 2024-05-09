import java.util.*;

/**
 * BinaryTreePath
 */

public class BinaryTreePath {
    
    public static void main(String[] args) {

        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        System.out.println(getPaths(root));

    }
    
    public static List<List<Integer>> getPaths(TreeNode head) {

        List<List<Integer>> result = new ArrayList<>();

        if (head == null)
            return result;

        addToPath(head, result, new ArrayList<>());

        return result;

    }
    
    public static void addToPath(TreeNode node, List<List<Integer>> paths, List<Integer> path) {

        if (node == null)
            return;

        path.add(node.val);

        if (node.left == null && node.right == null)
            paths.add(new ArrayList<>(path));

        else {
            addToPath(node.left, paths, path);
            addToPath(node.right, paths, path);
        }

        path.remove(path.size() - 1);
        
    }

    
}