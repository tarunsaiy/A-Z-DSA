import java.util.Arrays;

/*
LEETCODE : 70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2

Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
*/

public class OneStep {
    static int memorization(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    static int helper(int n, int[] dp){
        if(n <= 1) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    }
    static int tabulation(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    static int spaceOptimization(int n){
        int prev1 = 1, prev2 = 1;
        for(int i = 2; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println(memorization(33));
        System.out.println(tabulation(33));
        System.out.println(spaceOptimization(33));
    }
}
