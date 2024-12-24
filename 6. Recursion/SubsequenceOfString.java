import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsequenceOfString {
    static List<String> subSequence(String S){
        List<String> list = new ArrayList<>();
        helper(0, S, new String(""), list);
        Collections.sort(list);
        return list;
    }
    static void helper(int index, String S, String ans, List<String> list){
        if (index == S.length()){
            list.add(ans);
            return;
        }
        char ch = S.charAt(index);
        helper(index + 1, S, ans + ch, list);
        helper(index + 1, S, ans, list);
    }

    public static void main(String[] args) {
        String S = "abc";
        System.out.println(subSequence(S));
    }
}
