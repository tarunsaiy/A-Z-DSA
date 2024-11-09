public class Add1toLinkedList {
    public static void main(String[] args) {

    }
    static Node addOne(Node head){
       head = reverse(head);
       Node temp = head;
       while (temp != null){
           if(temp.data < 9){
               temp.data += 1;
               return reverse(head);
           }
           else{
               temp.data = 0;
               temp = temp.next;
           }
       }
       Node newnode = new Node(1);
       head = reverse(head);
       newnode.next = head;
       return newnode;
    }
    static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
