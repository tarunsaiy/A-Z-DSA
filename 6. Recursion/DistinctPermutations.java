import java.util.HashSet;
import java.util.Set;

public class DistinctPermutations {
    static int numTilePossibilities(String tiles) {
        Set<String> S = new HashSet<>();
        boolean[] check = new boolean[tiles.length()];
        f(tiles, check, "", S);
        return S.size() - 1;
    }
    static void f(String str, boolean[] check, String ans, Set<String> S){
        S.add(ans);
        for(int i = 0;i < str.length(); i++){
            if(!check[i]){
                check[i] = true;
                char ch = str.charAt(i);
                f(str, check, ans + ch, S);
                check[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
}
