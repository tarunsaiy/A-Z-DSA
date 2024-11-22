import java.util.Stack;

public class PostfixToInfinix {
    public static void main(String[] args) {
        System.out.println(postfixToPrefix("ab*c+"));
    }
    static String postfixToPrefix(String str){
        Stack<String> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)) s.push(Character.toString(ch));
            else {
                if(s.isEmpty()) return "invalid";
                String top1 = s.pop();
                String top2 = s.pop();
                String newString = "(" + top2 + ch + top1 + ")";
                s.push(newString);
            }
        }
        return s.peek();
    }
}
