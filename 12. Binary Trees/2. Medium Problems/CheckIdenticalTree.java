public class CheckIdenticalTree {
    static boolean checkIdentical(TreeNode p, TreeNode q){
        if (p == null || q == null) return p == q;
        return (p.val == q.val) && checkIdentical(p.left, q.left) && checkIdentical(p.right, q.right);
    }
}
