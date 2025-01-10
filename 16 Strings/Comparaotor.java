import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Comparaotor {
    public static void main(String[] args) {
        mycomp obj = new mycomp();
        String[] str = {"a","aa","b","ddddd","jff"};
        Arrays.sort(str, obj);
        System.out.println(Arrays.toString(str));
    }
}
class mycomp implements Comparator<String>{
   public int compare(String a, String b){
       return a.length() - b.length();
   }
}
