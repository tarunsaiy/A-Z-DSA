import java.util.Arrays;

public class CountVowelStringInRanges {
    static int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        boolean hash[] = new boolean[n];
        int index = 0;
        for (int i = 0; i < words.length; i++){
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length() - 1);
            if(check(start) && check(end)) hash[i] = true;
        }
        int[] prefixCount = new int[n + 1];
        for (int i = 0; i < hash.length; i++){
            prefixCount[i + 1] = prefixCount[i] + (hash[i] == true ? 1 : 0);
        }
        int[] A = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            int start = queries[i][0], end = queries[i][1];
            A[i] = prefixCount[end + 1] - prefixCount[start];
        }
        return A;
    }
    static boolean check(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(vowelStrings(words,queries)));
    }
}
