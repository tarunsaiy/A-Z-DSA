// Post Order Travesral : LEFT - RIGHT - ROOT
public class PostOrderTraversal {
    public static void main(String[] args) {

    }
    static void postOrderTraversal(Node node){
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }
}
