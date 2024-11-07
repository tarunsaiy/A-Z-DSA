public class ReverseSingleList {
    public static void main(String[] args) {

    }
}
/*
* Reversing Single Linked List
*
* ITERATIVE PROCESS:
* static Node reverse(Node head){
*   if(head == null || head.next == null) return head;
*   Node temp = head;
*   Node prev = null;
*   while(temp != null){
*      Node front = temp.next;
*      temp.next = prev;
*      prev = temp;
*      temp = front;
*    }
*   return prev;
* }
*
* RECURSIVE PROCESS
* static Node reverse(Node head){
*   if(head == null || head.next == null) return head;
*   Node newhead = reverse(head.next);
*   Node front = head.next;
*   front.next = head;
*   head.next = null;
*
*   return newhead;
*/