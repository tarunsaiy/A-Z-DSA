public class DeleteOccurences {
    public static void main(String[] args) {

    }
    static Node deleteOccurence(Node head, int x){
        Node temp = head;
        while (temp != null){
            if (temp.data == x){
                if (temp == head){
                    head = head.next;
                }
                Node prevnode = temp.prev;
                Node nextnode = temp.next;
                if  (prevnode != null) prevnode.next = nextnode;
                if(nextnode != null) nextnode.prev = prevnode;
            }
            temp = temp.next;
        }
        return head;
    }
}
