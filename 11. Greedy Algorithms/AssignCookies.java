import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while(j < s.length){
            if(s[j] >= g[i]) i += 1;
            j += 1;
        }
        return i;
    }
}


