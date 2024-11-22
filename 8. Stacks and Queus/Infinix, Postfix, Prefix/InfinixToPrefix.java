import java.util.Stack;

public class InfinixToPrefix {
    public static void main(String[] args) {
        System.out.println(infinixToPrefix("x+y*z/w+u"));
    }
    static String infinixToPrefix(String str){
        str = reverse(str);
        str = replace(str);

        Stack<Character> s = new Stack<>();

        String ans = new String();
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)) ans += ch;
            else if(ch == '(') s.push(ch);
            else if(ch == ')'){
                while (!s.isEmpty() && s.peek() != '('){
                    ans += s.pop();
                }
                s.pop();
            }
            else {
                if(ch == '^'){
                    while (!s.isEmpty() && priority(ch) <= priority(s.peek())){
                        ans += s.pop();
                    }
                }
                else {
                    while (!s.isEmpty() && priority(ch) < priority(s.peek())){
                        ans += s.pop();
                    }
                }
                s.push(ch);
            }
        }
        while (!s.isEmpty()){
            ans += s.pop();
        }
        ans = reverse(ans);
        return ans;

    }
    static int priority(char ch){
        if (ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
    static String reverse(String str){
        StringBuilder newstring = new StringBuilder(str);
        return newstring.reverse().toString();
    }
    static String replace(String str){
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]== '(') arr[i] = ')';
            else if (arr[i] == ')') arr[i] = '(';
        }
        String ans = "";
        for (char ch : arr){
            ans += ch;
        }
        return ans;
    }
}
