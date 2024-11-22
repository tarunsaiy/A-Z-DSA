import java.util.Stack;

public class PrefixToInfinix {
    public static void main(String[] args) {
        System.out.println(prefixToInfinix("*+PQ-MN"));
    }
    static String prefixToInfinix(String str){
        Stack<String> s = new Stack<>();
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)) s.push(Character.toString(ch));
            else {
                if(s.isEmpty()) return "invalid";
                String top1 = s.pop();
                String top2 = s.pop();
                String ans = "(" + top1 + ch + top2 + ")";
                s.push(ans);
            }
        }
        return s.peek();
    }
}
