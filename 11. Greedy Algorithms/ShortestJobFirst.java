import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7};
        System.out.println(shortestJobFirst(arr));
    }
    static int shortestJobFirst(int[] arr){
        Arrays.sort(arr);
        int wt = 0, t = 0;
        for (int i : arr){
            wt += t;
            t += i;
        }
        return wt;
    }
}
 