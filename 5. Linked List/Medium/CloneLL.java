public class CloneLL {
    public static void main(String[] args) {

    }
    static Node clone(Node head){
        if (head == null) return head;
        head = createcopy(head);
        head = linkRandom(head);
        return deattach(head);
    }
    static Node createcopy(Node head){
        Node temp = head;
        while(temp != null){
            Node copynode = new Node(temp.data);
            Node nextnode = temp.next;
            temp.next = copynode;
            copynode.next = nextnode;
            temp = nextnode;
        }
        return head;
    }
    static Node linkRandom(Node head){
        Node temp = head;
        while (temp != null){
            Node copynode = temp.next;
            if(temp.random != null) copynode.random = temp.random.next;
            else copynode.random = null;
            temp = temp.next.next;
        }
        return head;
    }
    static Node deattach(Node head){
        Node dummy = new Node(-1);
        Node res = dummy;
        Node temp = head;
        while(temp != null){
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
