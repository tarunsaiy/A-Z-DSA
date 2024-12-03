import java.util.Arrays;

public class LongestSubStringLength {
    public static void main(String[] args) {
        System.out.println(longestSubstring("bbbbabbb"));
    }
    static String longestSubstring(String str){
        String s = "";
        int start = -1, end = -1;
        int hash[] = Arrays.stream(new int[255]).map(i -> -1).toArray();
        int l = 0, r = 0, max = 0, n = str.length();
        while (r < n){
            if(hash[str.charAt(r)] != -1){
                if(hash[str.charAt(r)] >= l){
                    l = hash[str.charAt(r)] + 1;
                }
            }
            if(max < (r - l + 1)){
                max = r - l + 1;
                start = l;
                end = r;
            }
            hash[str.charAt(r)] = r;
            r += 1;
        }
        for (int i = start; i <= end; i++){
            s += str.charAt(i);
        }
        return s;
//        return max; if return type is length return max
    }
}
