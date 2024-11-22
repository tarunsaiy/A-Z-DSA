import java.util.Stack;

public class InfinixToPostfix {
    public static void main(String[] args) {
        System.out.println(infinixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
    static String infinixToPostfix(String str){
        String ans = new String("");
        Stack<Character> s = new Stack<>();
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)) ans += ch;
            else if(ch == '(') s.push(ch);
            else if(ch == ')'){
                while (!s.isEmpty() && s.peek() != '(') ans += s.pop();
                s.pop();
            }
            else {
                while (!s.isEmpty() && priority(ch) <= priority(s.peek())){
                    ans += s.pop();
                }
                s.push(ch);
            }
        }
        while (!s.isEmpty()){
            if(s.peek() == '(') return "Invalid";
            ans += s.pop();
        }
        return ans;
    }
    static int priority(char ch){
        if (ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
}
