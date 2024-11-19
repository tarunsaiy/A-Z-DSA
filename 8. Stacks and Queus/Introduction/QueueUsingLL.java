public class QueueUsingLL {
    public static void main(String[] args) {
        Queues queue = new Queues();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.show();
    }
}
class Queues{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    int size = 0;
    Node front;
    Node rear;
    Queues(){
        this.size = 0;
        this.front = this.rear = null;
    }
    public void enqueue(int data){
        Node node = new Node(data);
        if(front == null){
            front = rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
        size += 1;
    }
    public int dequeue(){
        if(front == null) return -1;
        int x = front.data;
        front = front.next;
        size -= 1;
        return x;
    }
    public int peek(){
        if(front == null) return -1;
        return front.data;
    }
    public int size(){
        return size;
    }
    public void show(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}