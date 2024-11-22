import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        MainClass q = new MainClass();
        q.push(10);
        q.push(20);
        q.push(30);
        q.show();
        System.out.println(q.peek());
        System.out.println(q.pop());
        q.show();
        q.push(40);
        q.show();
        System.out.println(q.pop());
        q.show();

    }

}
class MainClass{
    private Stack<Integer> s1,s2;
    MainClass(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int x){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int pop(){
        return s1.pop();
    }
    public int peek(){
        return s1.peek();
    }
    public void show(){
        Stack<Integer> s3 = new Stack<>();
        while (!s1.isEmpty()){
            System.out.print(s1.peek() + "-");
            s3.push(s1.pop());
        }
        while (!s3.isEmpty()){
            s1.push(s3.pop());
        }
        System.out.println();
    }
}
