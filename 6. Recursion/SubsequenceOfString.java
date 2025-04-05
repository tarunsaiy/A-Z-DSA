import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SubsequenceOfString {
    static HashSet<String> subSequence(String S){
        HashSet<String> list = new HashSet<>();
        helper(0, S, new String(""), list);
//        Collections.sort(list);
        return list;
    }
    static void helper(int index, String S, String ans, HashSet<String> list){
        if (index == S.length()){
            list.add(ans);
            return;
        }
        char ch = S.charAt(index);
        helper(index + 1, S, ans + ch, list);
        helper(index + 1, S, ans, list);
    }

    public static void main(String[] args) {
//        String s = "AABAAB";
        String s = "AB";
        System.out.println(subSequence(s));
    }
}
