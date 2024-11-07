public class PalindromeCheck {
    public static void main(String[] args) {

    }
}
static boolean palindromecheck(Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node newhead = reverse(slow);
    while (newhead != null){
        if(head.data != newhead.data) return false;
        newhead = newhead.next;
        head = head.next;
    }
    return true;
}
static Node reverse(Node head){
    Node temp = head;
    Node prev = null;
    while (temp != null){
        Node front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
    }
    return prev;
}