import java.util.*;

public class TopView {
    static List<Integer> topView(TreeNode root){
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()){
            Pair pair = q.remove();
            TreeNode node = pair.node;
            int x = pair.x;
            if (!map.containsKey(x)) map.put(x, node.val);
            if (node.left != null) q.add(new Pair(x - 1, node.left));
            if (node.right != null) q.add(new Pair(x + 1, node.right));
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> i: map.entrySet()){
            list.add(i.getValue());
        }
        return list;
    }
}
class Pair{
    int x;
    TreeNode node;
    Pair(int _x, TreeNode _node){
        x = _x;
        node = _node;
    }
}
