import java.util.ArrayList;
import java.util.List;

public class LexographicalStringOfLengthN {
    static void f(String ans, List<String> L, int n){
        if(ans.length() == n){
            L.add(ans); return;
        }
        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (ans.isEmpty() || ans.charAt(ans.length() - 1) != ch){
                f(ans + ch, L, n);
            }
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("39");
        sb.append(2);
        sb.append("a");
        System.out.println(sb);
        String ans = "dd";
        ans.endsWith()

    }
}
