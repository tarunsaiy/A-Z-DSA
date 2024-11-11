import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairs {
    public static void main(String[] args) {

    }
    static List<List<Integer>> deletePairs(Node head, int target){
        List<List<Integer>> list = new ArrayList<>();
        Node tail = findtail(head);
        if(head == null) return list;
        while(head.data < tail.data){
            if (head.data + tail.data == target){
                list.add(Arrays.asList(head.data, tail.data));
                head = head.next;
                tail = tail.prev;
            } else if (head.data + tail.data < target) {
                head = head.next;
            } else tail = tail.prev;
        }
        return list;
    }
    static Node findtail(Node head){
        while(head.next != null){
            head = head.next;
        }
        return head;
    }
}
