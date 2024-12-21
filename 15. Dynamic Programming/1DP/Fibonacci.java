import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(bottomUp(6));
        System.out.println(topDown(5));
    }
    static long bottomUp(int n){
        long dp[] = new long[n + 1];
        Arrays.fill(dp, -1);
        return fib(n, dp);
    }
    static long fib(int n, long[] dp){
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = (fib(n - 1, dp) + fib(n - 2, dp)) % 1000000007;
    }
    static long topDown(int n){
        long[] A = new  long[n + 1];
        if(n <= 1) return n;
        A[0] = 0; A[1] = 1;
        for (int i = 2; i <= n; i++){
            A[i] = (A[i - 1] + A[i - 2]) % 1000000007;
        }
        return A[n];
    }
}

