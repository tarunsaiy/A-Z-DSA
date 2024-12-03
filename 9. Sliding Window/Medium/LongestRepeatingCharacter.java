public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(longestRepeatingCHaracter("BAAAXCCCC", 0));
    }
    static int longestRepeatingCHaracter(String str, int k){
        int l = 0, r = 0, max = 0, maxfreq = 0, n = str.length();
        int[] hash = new int[26];
        while (r < n){
            char ch = str.charAt(r);
            hash[ch - 'A'] += 1;
            maxfreq = Math.max(maxfreq, hash[ch - 'A']);
            if((r - l + 1) - maxfreq > k){
                hash[str.charAt(l) - 'A'] -= 1;
                l += 1;
            }
            if(r - l + 1 - maxfreq <= k){
                max = Math.max(max, r - l + 1);
            }
            r +=1;
        }
        return max;
    }
}
