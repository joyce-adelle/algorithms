import java.util.ArrayList;
import java.util.List;

public class SumOfPathNumbers {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(12, new TreeNode(7, new TreeNode(9), null),
                new TreeNode(1, new TreeNode(10), new TreeNode(5)));
        
        TreeNode root1 = new TreeNode(1, new TreeNode(0, new TreeNode(1), null),
                new TreeNode(1, new TreeNode(6), new TreeNode(5)));

        System.out.println(findPathSum(root));
        System.out.println();
        System.out.println(findPathSum(root1));
        System.out.println();
        System.out.println(findPathSumOp(root1, 0));

    }

    public static int findPathSum(TreeNode root) {

        if (root == null)
            return 0;
        
        List<Integer> paths = new ArrayList<>();
        int result = 0;

        findPathSum(root, "", paths);

        for (Integer path : paths)
            result += path;

        return result;

        
    }

    private static void findPathSum(TreeNode node, String path, List<Integer> paths) {

        if (node == null)
            return;

        path += node.val;

        if (node.left == null && node.right == null)
            paths.add(Integer.valueOf(path));

        findPathSum(node.left, path, paths);
        findPathSum(node.right, path, paths);

        path.replaceAll(".$", "");
    }
    
    private static int findPathSumOp(TreeNode node, int result) {

        if (node == null)
            return 0;

        result = 10 * result + node.val;

        if (node.left == null && node.right == null)
            return result;

        return findPathSumOp(node.left, result) + findPathSumOp(node.right, result);

    }
    
}
