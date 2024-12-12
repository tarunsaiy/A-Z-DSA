import java.util.*;

public class BinaryTreeZigZag {
    static List<List<Integer>> zigzag(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);
        boolean turn = true;
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> sublist = new ArrayList<>(size);
            for (int i = 0; i < size; i++){
                if (q.peek().left != null) q.add(q.peek().left);
                if (q.peek().right != null) q.add(q.peek().right);
                sublist.add(q.peek().val);
                q.remove();
            }
            if (!turn) Collections.reverse(sublist);
            turn = !turn;
            list.add(sublist);
        }
        return list;
    }
}
