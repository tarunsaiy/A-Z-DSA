import java.util.Arrays;

public class LongestSubStringLength {
    public static void main(String[] args) {
        System.out.println(longestSubstring(""));
    }
    static int longestSubstring(String str){
        int hash[] = Arrays.stream(new int[255]).map(i -> -1).toArray();
        int l = 0, r = 0, max = 0, n = str.length();
        while (r < n){
            if(hash[str.charAt(r)] != -1){
                if(hash[str.charAt(r)] >= l){
                    l = hash[str.charAt(r)] + 1;
                }
            }
            max = Math.max(max, r - l + 1);
            hash[str.charAt(r)] = r;
            r += 1;
        }
        return max;
    }
}
