import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Mainfunction obj = new Mainfunction();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.show();
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        obj.push(40);
        obj.show();
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
        for (int i = 0; i < q.size()- 1; i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        return q.remove();
    }
    public int peek(){
        return q.peek();
    }
    public void show(){
        Queue<Integer> qq = new LinkedList<>();

        while (!q.isEmpty()){
            qq.add(q.peek());
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        while (!qq.isEmpty()){
            q.add(qq.remove());
        }
    }
}