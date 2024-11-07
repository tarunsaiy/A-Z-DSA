public class StartingPointOfLoop {
    public static void main(String[] args) {

    }
    static Node startingNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != nll && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
