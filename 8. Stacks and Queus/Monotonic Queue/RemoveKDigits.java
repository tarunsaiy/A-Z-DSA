import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        System.out.println(removeKDigits("92916",2));
    }
    static String removeKDigits(String str, int k){
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()){
            while (!s.isEmpty() && k > 0 && s.peek() - '0' > ch - '0'){
                s.pop();
                k -= 1;
            }
            s.push(ch);
        }
        while (k > 0) {
            s.pop();
            k -= 1;
        };
        if(s.isEmpty()) return "0";
        String ans = "";
        while (!s.isEmpty()) ans += s.pop();
        while (ans.length() > 0 && ans.charAt(ans.length() - 1) == '0'){
            ans = ans.substring(0, ans.length() - 1);
        }
        if(ans == "") return "0";
        StringBuilder ss = new StringBuilder(ans);
        return ss.reverse().toString();
    }
}
