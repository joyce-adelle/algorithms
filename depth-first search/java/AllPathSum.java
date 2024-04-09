import java.util.ArrayList;
import java.util.List;

public class AllPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        System.out.println(findPathSum(root, 23));

        TreeNode root1 = new TreeNode(12, new TreeNode(7, new TreeNode(4), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));

        System.out.println(findPathSum(root1, 23));

    }

    public static List<List<Integer>> findPathSum(TreeNode node, int sum) {

        if (node == null)
            return new ArrayList<>();
        
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        findPathSum(node, sum, path, allPaths);

        return allPaths;
    }
    
    public static void findPathSum(TreeNode node, int sum, List<Integer> path, List<List<Integer>> allPaths) {

        if (node == null)
            return;

        path.add(node.val);
        
        if (node.val == sum && node.left == null && node.right == null)
            allPaths.add(new ArrayList<>(path));
        else {
            findPathSum(node.left, sum - node.val, path, allPaths);
            findPathSum(node.right, sum - node.val, path, allPaths);
        }

        // System.out.println(path);
        path.remove(path.size() - 1);

    }

}
