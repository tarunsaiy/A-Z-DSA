public class StackUsingLL {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.size);
    }
}
class StackLL{
    public class Stack{
        int data;
        Stack next;
        Stack(int data){
            this.data = data;
            this.next = null;
        }
    }
    Stack top;
    int size;
    StackLL(){
        this.size = 0;
        this.top = null;
    }
    public void push(int data){
        Stack stack = new Stack(data);
        stack.next = top;
        top = stack;
        size += 1;
    }
    public int pop(){
        if(top == null) return -1;
        int x = top.data;
        top = top.next;
        size -= 1;
        return x;
    }
    public int peek(){
        if (top == null) return -1;
        return top.data;
    }
    public void show(){
        Stack temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
