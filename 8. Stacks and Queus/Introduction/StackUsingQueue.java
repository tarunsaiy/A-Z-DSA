import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Mainfunction obj = new Mainfunction();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.pop();
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
    }

}
class Mainfunction{
    Queue<Integer> q;
    Mainfunction(){
        q = new LinkedList<>();
    }
    public void push(int data){
        q.add(data);
        for (int i = 0; i < q.size(); i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        return q.remove();
    }
    public int peek(){
        return q.peek();
    }
}