import java.util.HashMap;

public class LongestSubStringwithKdistinctCharacters {
    public static void main(String[] args) {
        System.out.println(longest("aaabbccd", 1));
    }
    static int longest(String str, int k){
        int r = 0, l = 0, max = 0, n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < n){
            char ch = str.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.size() > k){
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                l += 1;
            }
            if(map.size() <= k){
                max = Math.max(max, r - l + 1);
            }
            r += 1;
        }
        return max;
    }
}
