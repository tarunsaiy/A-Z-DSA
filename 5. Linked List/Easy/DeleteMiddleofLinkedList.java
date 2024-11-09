public class DeleteMiddleofLinkedList {
    public static void main(String[] args) {
//        deletemiddle(Node head);
    }
}
/* delete middle of the linked list
*/

 static ListNode deletemiddle(ListNode head){
    if(head == null || head.next == null) return null;
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    if(slow.next == null){
        head.next = null;
        return head;
    }
    slow.data = slow.next.data;
    slow.next = slow.next.next;
    return head;
}
