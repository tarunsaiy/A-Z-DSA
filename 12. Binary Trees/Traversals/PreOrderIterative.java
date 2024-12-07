import java.util.Stack;

public class PreOrderIterative {
    static void preOrder(Node root){
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            root = s.pop();
            System.out.print(root.data);
            if (root.right != null) s.push(root.right);
            if (root.left != null) s.push(root.left);
        }
    }
}
