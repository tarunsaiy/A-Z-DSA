public class CheckfortheBalancedTree {
    public static void main(String[] args) {

    }
    static boolean checkBalanced(TreeNode root){
        return maximumHeight(root) != -1;
    }
    static int maximumHeight(TreeNode root){
        if (root == null) return 0;
        int lh = maximumHeight(root.left);
        if (lh == -1) return -1;
        int rh = maximumHeight(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}
