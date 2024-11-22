import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        System.out.println(postfixToPrefix("AB-DE+F*/"));
    }
    static String postfixToPrefix(String str){
        Stack<String> s = new Stack<>();
        for (char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)) s.push(Character.toString(ch));
            else {
                String top1 = s.pop();
                String top2 = s.pop();
                String top = ch + top2 + top1;
                s.push(top);
            }
        }
        return s.peek();
    }
}
