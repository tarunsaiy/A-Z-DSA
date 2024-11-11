import org.w3c.dom.Node;

public class ReverseLLInSizeOfGroupK {
    public static void main(String[] args) {

    }
    static Node reverseSizeOfK(int k, Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node kthnode = getkthnode(temp, k);
            if(kthnode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            Node nextnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if(head == temp){
                head = kthnode;
            }
            else {
                prev.next = temp;
            }
            prev = temp;
            temp = nextnode;
        }
        return head;
    }
    static Node getkthnode(Node head, int k){
        int i = 0;
        while(head != null && i < k){
            head = head.next;
        }
        return head;
    }
    static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node nextnode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextnode;
        }
        return prev;
    }
}
