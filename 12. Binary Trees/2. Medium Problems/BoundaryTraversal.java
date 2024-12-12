import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    static void addLeftBoundary(TreeNode root, ArrayList<Integer> A){
        TreeNode node = root.left;
        while (node != null){
            if (!isLeaf(node)) A.add(node.val);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }
    static void addRightBoundary(TreeNode root, ArrayList<Integer> A){
        TreeNode node = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (node != null){
            if (!isLeaf(node)) temp.add(node.val);
            if (node.right != null) node = node.right;
            else node = node.left;
        }
        for (int i = temp.size() - 1; i >= 0; i--){
            A.add(temp.get(i));
        }
    }
    static void addLeaves(TreeNode node, ArrayList<Integer> A){
        if (node.left != null) addLeaves(node.left, A);
        if (isLeaf(node)) A.add(node.val);
        else if (node.right != null) addLeaves(node.right, A);
    }
    static List<Integer> boundaryLevel(TreeNode root){
        ArrayList<Integer> A = new ArrayList<>();
        if (!isLeaf(root)) A.add(root.val);
        addLeftBoundary(root, A);
        addLeaves(root, A);
        addRightBoundary(root, A);
        return A;
    }
}
