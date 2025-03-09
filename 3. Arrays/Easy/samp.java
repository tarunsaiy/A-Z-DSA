import java.util.* ;
import java.io.*;
public class samp {

    static public int minimumRecolors(String blocks, int k) {
        int maxBlack = 0, cnt = 0;
        for (char ch : blocks.toCharArray()) {
            if (ch == 'B') {
                cnt += 1; maxBlack = Math.max(maxBlack, cnt);
            }
            else cnt = 0;
        }
        if (maxBlack >= k) return 0;
        int min = blocks.length();
        for (int i = 0; i < blocks.length() && i + k < blocks.length(); i++) {
            cnt = 0; maxBlack = k;
            for (int j = i; j < blocks.length(); j++) {
                if (maxBlack == 0) break;
                if (blocks.charAt(i) == 'W') cnt += 1;
                maxBlack -= 1;
            }
            min = Math.min(min, cnt);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }
}
