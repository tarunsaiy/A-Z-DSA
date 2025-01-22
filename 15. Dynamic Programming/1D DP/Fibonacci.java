import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(bottomUp(65));
        System.out.println(topDown(65));
        System.out.println(optimalFibonacci(65));
    }
    static long bottomUp(int n){
        long dp[] = new long[n + 1];
        Arrays.fill(dp, -1);
        return fib(n, dp);
//        TC: O(N) && SC: O(N) + O(N)
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
//        TC: O(N) && SC: O(N)
    }
    static int optimalFibonacci(int n){
        int prev1 = 1, prev2 = 0;
        for (int i = 2; i <= n; i++){
            int curr = (prev1 + prev2) % 1000000007;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

