import java.util.Arrays;

public class NumberOfSubstringsContaingAllthreeChar {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
    static int numberOfSubstrings(String str){
        int lastseen[] = new int[3];
        int cnt = 0;
        Arrays.fill(lastseen, -1);
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            lastseen[ch - 'a'] = i;
            if(lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1){
                cnt += Math.min(Math.min(lastseen[0], lastseen[1]), lastseen[2]) + 1;
            }
        }
        return cnt;
    }
}
