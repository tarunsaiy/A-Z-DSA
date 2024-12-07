import java.util.ArrayList;
import java.util.List;

public class Combinational {
    static ArrayList<Integer> arr;
    static void inOrderTraversal(Node node){
        if (node == null) return;
        inOrderTraversal(node.left);
        arr.add(node.data);
        inOrderTraversal(node.right);
    }
    static ArrayList<Integer> getInorder(Node node){
        arr = new ArrayList<>();
        inOrderTraversal(node);
        return arr;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

    }
}

