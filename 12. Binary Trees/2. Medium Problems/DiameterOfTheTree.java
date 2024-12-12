/*Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.*/
/*Leetcode 543*/


public class DiameterOfTheTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return max;
    }
    public int findMax(TreeNode root){
        if (root == null) return 0;
        int lh = findMax(root.left);
        int rh = findMax(root.right);
        max = Math.max(max , lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
