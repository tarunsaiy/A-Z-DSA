import java.util.HashMap;

public class LRU_Cache {
}
class LRUCache{
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer, Node> map = new HashMap<>();
    int cap;

    LRUCache(int capacity){
        head.next = tail;
        tail.prev = head;
        cap = capacity;
    }
    public int get(int key){
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        int data = node.val;
        remove(node);
        insert(node);
        return data;
    }
    public void put(int key, int value){
        if(map.containsKey(key)){
            Node temp = map.get(key);
            map.remove(key);
            remove(temp);
        }
        if(map.size() == cap){
            map.remove(tail.prev.key);
            remove(tail.prev);
        }
        insert(new Node(key, value));
        map.put(key, head.next);
    }
    public void remove(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    public void insert(Node node){
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}
