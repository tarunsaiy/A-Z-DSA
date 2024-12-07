// InOrder Traversal : Left - Root - Right
public class InOrderTraversal {
    public static void main(String[] args) {

    }
    static void inOrderTraversal(Node node){
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }
}
