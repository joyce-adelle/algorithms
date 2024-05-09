public class PathWithGivenSequence {

    public static void main(String[] args) {

    }

    public static boolean hasPathWithSequence(TreeNode node, int[] sequence) {

        if (node == null)
            return sequence.length == 0;

        return hasPathWithSequence(node, sequence, 0);

    }

    public static boolean hasPathWithSequence(TreeNode node, int[] sequence, int idx) {

        if (node == null)
            return false;

        if (idx > sequence.length || sequence[idx] != node.val)
            return false;

        if (node.left == null && node.right == null && sequence[idx] == node.val && sequence.length - 1 == idx)
            return true;

        return hasPathWithSequence(node.left, sequence, idx + 1) || hasPathWithSequence(node.right, sequence, idx + 1);

    }

}
