public class Length_of_a_Loop {
    public static void main(String[] args) {

    }
    static int findLength(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return length(slow, fast);
            }
        }
        return 0;
    }
    static int length(Node slow, Node fast){
        int cnt = 1;
        slow = slow.next;
        while(slow != fast){
            slow = slow.next;
            cnt += 1;
        }
        return cnt;
    }
}
