// PreOrder : Root - left - right

public class PreOrderTraversa {
    public static void main(String[] args) {

    }
    static void preOrderTraversal(Node node){
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
