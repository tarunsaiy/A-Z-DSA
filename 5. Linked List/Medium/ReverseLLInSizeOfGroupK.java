import org.w3c.dom.Node;

public class ReverseLLInSizeOfGroupK {
    public static void main(String[] args) {

    }
    static Node reverseSizeOfK(int k, Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node kthnode = getkthnode(temp, k);
            if(kthnode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            Node nextnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if(head == temp){
                head = kthnode;
            }
            else {
                prev.next = kthnode;
            }
            prev = temp;
            temp = nextnode;
        }
        return head;
    }
    static Node getkthnode(Node head, int k){
        int i = 0;
        while(head != null && i < k){
            head = head.next;
        }
        return head;
    }
    static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node nextnode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextnode;
        }
        return prev;
    }
}

//Extended problem
/****************************************************************

 Following is the class structure of the Node class:

 class Node
 {
 public:
 int data;
 Node *next;
 Node(int data)
 {
 this->data = data;
 this->next = NULL;
 }
 };

 *****************************************************************/

public class Solution {
    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < n && temp != null; i++) {
            if(b[i] == 0) continue;
            Node kNode = getKthNode(temp, b[i]);
            if (kNode == null) {
                if (prev != null) {
                    prev.next = kNode;
                }
                break;
            }
            Node nextnode = kNode.next;
            kNode.next = null;
            reverse(temp);
            if (head == temp) {
                head = kNode;
            }
            else {
                prev.next = kNode;
            }
            prev = temp;
            temp = nextnode;
        }
        if(prev != null) {
            prev.next = temp;
        }
        return head;
    }
    static Node getKthNode(Node node, int k){
        while(node.next != null && k-- > 1){
            node = node.next;
        }
        return node;
    }
    static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
