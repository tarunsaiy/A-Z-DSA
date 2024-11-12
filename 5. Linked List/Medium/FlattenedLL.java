public class FlattenedLL {
    public static void main(String[] args) {

    }
    static Node flatten(Node head){
        if(head.next == null) return head;
        Node mergedhead = flatten(head.next);
        head = merge(head,mergedhead);
        return head;
    }
    static Node merge(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (list1 != null && list2 != null){
            if(list1.data <= list2.data){
                temp.bottom = list1;
                list1 = list1.bottom;
            }
            else {
                temp.bottom = list2;
                list2 = list2.bottom;
            }
            temp = temp.bottom;
            temp.next = null;
        }
        if(list1 != null){
            temp.bottom = list1;
        }
        else temp.bottom = list2;
        if(dummy.child != null){
            dummy.child.next = null;
        }
        return dummy.next;
    }
}
