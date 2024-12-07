import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {

    }
    static List<List<Integer>> levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < size; i++){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                sublist.add(q.remove().data);
            }
            list.add(sublist);
        }
        return list;
    }
}
