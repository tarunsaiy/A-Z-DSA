import java.util.Stack;

public class ValidParenthasis {
    public static void main(String[] args) {
        System.out.println(check("({([]{})})"));
    }
    static boolean check(String str){
        Stack<Character> s = new Stack();
        for (char ch : str.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '(') s.push(ch);
            else {
                if(s.isEmpty()) return false;
                else{
                    char top = s.pop();
                    if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) continue;
                    else return false;
                }
            }
        }
        return s.isEmpty();
    }
}

