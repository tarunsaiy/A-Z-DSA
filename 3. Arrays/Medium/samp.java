import java.util.*;
public class samp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            int cnt = 1;
            while(A.size() != 1) {
                A.remove(0);
                if(A.size() > 2) A.remove(2);
                cnt += 1;
            }
            System.out.println(cnt);
        }
    }
}
