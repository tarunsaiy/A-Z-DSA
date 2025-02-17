import java.io.*;
import java.util.*;

public class TUF {
    static int numTilePossibilities(String tiles) {
        HashSet<String> S = new HashSet<>();
        for(int i = 0; i < tiles.length(); i++){
            String str = "";
            str += tiles.charAt(i);
            S.add(str);
            for(int j = 0; j < tiles.length(); j++){
                if(i == j){
                    S.add(str); continue;
                }
                str += tiles.charAt(j);
                S.add(str);
            }
        }
        return S.size();
    }
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
}
