
public class RemoveDuplicatesFromDLL {
    public static void main(String[] args) {

    }
    static Node deleteduplictaes(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head;
        while(temp != null && temp.next != null){
            Node nextnode = temp.next;
            while(nextnode != null && temp.data == nextnode.data) nextnode = nextnode.next;
            temp.next = nextnode;
            if(nextnode != null) nextnode.prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
