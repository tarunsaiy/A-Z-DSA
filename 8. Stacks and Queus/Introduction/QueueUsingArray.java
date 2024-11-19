public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println(queue.getSize());
        queue.pop();
        queue.pop();
        queue.pop();
        queue.push(30);
        System.out.println(queue.getSize());
        System.out.println(queue.top());
    }
}
class Queue{
    int currSize;
    int maxSize;
    int[] arr;
    int start;
    int end;
    public Queue(){
        this.currSize = 0;
        this.maxSize = 16;
        this.arr = new int[maxSize];
        this.start = -1;
        this.end = -1;
    }
    public Queue(int size){
        this.currSize = 0;
        this.maxSize = size;
        this.arr = new int[maxSize];
        this.start = -1;
        this.end = -1;
    }
    public void push(int x){
        if(currSize == maxSize) {
            System.out.println("queue overflow");
            System.exit(1);
        }
        if(end == start){
            start = end = 0;
        }
        else {
            end = (end + 1) % maxSize;
        }
        arr[end] = x;
        currSize += 1;
    }
    public int pop(){
        if(currSize == 0) {
            System.out.println("queue underflow");
            System.exit(1);
        }
        int x = arr[start];
        if(currSize == 1){
            start = end = -1;
        }
        else start = (start + 1) % maxSize;
        currSize -= 1;
        return x;
    }
    public int top(){
        if(start == -1){
            System.out.println("queue underflow");
            System.exit(1);
        }
        return arr[start];
    }
    public int getSize(){
        return currSize;
    }
}