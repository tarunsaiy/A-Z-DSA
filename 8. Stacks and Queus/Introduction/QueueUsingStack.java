import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingStack {
}
class MainClass{
    Stack<Integer> s1,s2;
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
}
