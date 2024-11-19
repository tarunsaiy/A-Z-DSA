public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.top());
    }
}
class Stack{
    int size = 10000;
    int top = -1;
    int arr[] = new int[size];
    public void push(int elem){
        top += 1;
        arr[top] = elem;
    }
    public int pop(){
        if(top == -1){
            return -1;
        }
        int x = arr[top];
        top -= 1;
        return x;
    }
    public int top(){
        return arr[top];
    }
    public int size(){
        return top + 1;
    }
}