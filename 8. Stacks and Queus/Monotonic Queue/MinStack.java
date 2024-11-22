import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Min_Stack obj = new Min_Stack();
        obj.push(10);
        obj.push(5);
        obj.push(30);
        System.out.println(obj.getMin());
    }
}
class Min_Stack{
    Stack<Long> s;
    Long min;
    Min_Stack(){
        s = new Stack<>();
        min = Long.MAX_VALUE;
    }
    public void push(int value){
        Long val = Long.valueOf(value);
        if(s.isEmpty()){
            s.push(val);
            min = val;
        }
        else {
            if (val > min) s.push(val);
            else {
                s.push(2 * val - min);
                min = val;
            }
        }
    }
    public void pop(){
        long x = s.pop();
        if(x < min){
            min = 2 * min - x;
        }
    }
    public int top(){
        if(s.peek() > min) return s.peek().intValue();
        return min.intValue();
    }
    public int getMin(){
        return min.intValue();
    }
}