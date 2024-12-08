//Given the root of a binary tree, return its maximum depth.
//
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class MaximumDepthOfATree {
    static int maximumDepth(TreeNode root){
        if (root == null) return 0;
        int lh = maximumDepth(root.left);
        int rh = maximumDepth(root.right);
        return 1 + Math.max(lh, rh);
    }
}
