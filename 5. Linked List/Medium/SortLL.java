public class SortLL {
    public static void main(String[] args) {

    }
    static Node sort(Node head){
        if(head == null || head.next == null) return head;
        Node middle = getMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;
        left = sort(left);
        right = sort(right);
        return merge(left, right);
    }
    static Node getMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node merge(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (list1 != null && list2 != null){
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null) temp.next = list1;
        else temp.next = list2;
        return dummy.next;
    }
}
