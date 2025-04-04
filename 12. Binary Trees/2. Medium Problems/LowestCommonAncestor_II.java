public class LowestCommonAncestor_II {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxHeight = getHeight(root);
        return f(root, maxHeight, 1);
    }
    public TreeNode f(TreeNode root, int maxHeight, int level) {
        if (root == null) return null;
        if (maxHeight == level) return root;
        TreeNode left = f(root.left, maxHeight, level + 1);
        TreeNode right = f(root.right, maxHeight, level + 1);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return 1 + Math.max(lh, rh);
    }
}
