import org.w3c.dom.Node;

public class RotateLL {
    public static void main(String[] args) {

    }
    static Node rotate(Node head, int k){
        if(k == 0 || head == null) return head;
        int length = getLength(head);
        Node tail = getTail(head);
        if(k % length == 0) return head;
        k %= length;
        tail.next = head;
        Node kthnode = getkthNode(head, length - k);
        head = kthnode.next;
        kthnode.next = null;
        return head;
    }
    static int getLength(Node head){
        int len = 0;
        while(head != null){
            head = head.next;
            len += 1;
        }
        return len;
    }
    static Node getTail(Node head){
       while(head.next != null){
           head = head.next;
       }
       return head;
    }
    static Node getkthNode(Node head, int k){
        int i = 1;
        while(head.next != null && i < k){
            head = head.next;
            i += 1;
        }
        return head;
    }

}

