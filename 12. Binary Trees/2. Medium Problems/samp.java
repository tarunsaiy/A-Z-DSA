import java.util.Arrays;

public class samp {
    public static void main(String[] args) {
        int[] arr = {-10, -10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(constructTransformedArray(arr)));
    }
    static int[] constructTransformedArray(int[] A) {
        int n = A.length;
        int res[] = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = A[(i + A[i] % n + n) % n];
        }
        return res;
    }
}
