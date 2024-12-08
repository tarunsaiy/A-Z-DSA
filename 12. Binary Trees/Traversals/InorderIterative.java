import java.util.Stack;

public class InorderIterative {
    static void inOrder(Node root){
        Stack<Node> s = new Stack<>();
        Node node = root;
        while (true){
            if (node != null){
                s.push(node);
                node = node.left;
            }
            else {
                if (s.isEmpty()) break;
                node = s.pop();
                System.out.println(node.data);
                node = node.right;
            }
        }
    }
}
