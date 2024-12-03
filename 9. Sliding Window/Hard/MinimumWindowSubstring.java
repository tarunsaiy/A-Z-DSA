public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minimumSubstring("ADOBECODEBANC", "ABC"));
    }
    static String minimumSubstring(String s, String t){
        if(s == null || t == null) return "";
        int n = s.length();
        int m = t.length();
        if(n < m) return "";
        int[] hash = new int[256];
        for (int i = 0; i < t.length(); i++){
            hash[t.charAt(i)] += 1;
        }
        int l = 0, r = 0, minlength = Integer.MAX_VALUE, startIndex = -1, cnt = 0;
        while (r < n){
            char ch = s.charAt(r);
            if (hash[ch] > 0) cnt += 1;
            hash[ch] -= 1;
            while (cnt == m){
                if (r - l + 1 < minlength){
                    minlength = r - l + 1;
                    startIndex = l;
                }
                hash[s.charAt(l)] += 1;
                if(hash[s.charAt(l)] > 0) cnt -= 1;
                l += 1;

            }
            r += 1;
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minlength);
    }
}
