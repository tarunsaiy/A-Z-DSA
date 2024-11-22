import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        System.out.println(prefixToPostFix("/-AB*+DEF"));
    }
    static String prefixToPostFix(String str){
        Stack<String> s = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)) s.push(Character.toString(ch));
            else {
                String top1 = s.pop();
                String top2 = s.pop();
                String top = top1 + top2 + ch;
                s.push(top);
            }
        }
        return s.peek();
    }
}
