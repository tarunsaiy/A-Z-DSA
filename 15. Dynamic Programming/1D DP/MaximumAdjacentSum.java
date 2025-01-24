import java.util.Arrays;
import java.util.Comparator;

public class MaximumAdjacentSum {
    static int memorization(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return helper(arr,arr.length - 1, dp);

    }
    static int helper(int[] arr, int index, int[] dp){
        if(index < 0) return 0;
        if(index == 0) return arr[index];
        if (dp[index] != -1) return dp[index];
        int take = arr[index] + helper(arr, index - 2, dp);
        int skip = 0 + helper(arr, index - 1, dp);
        return dp[index] = Math.max(skip, take);
    }

    static int tabulation(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            int take = arr[i];
            if(i > 1) take += dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(skip, take);
        }
        return dp[arr.length - 1];
    }

    static int spaceOptimization(int[] arr){
        int prev1 = arr[0], prev2 = 0;
        for (int i = 1; i < arr.length; i++){
            int take = arr[i];
            if(i > 1) take += prev2;
            int skip = prev1;
            int curr = Math.max(take, skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(memorization(arr));
        System.out.println(tabulation(arr));
        System.out.println(spaceOptimization(arr));
    }
}
