import java.util.Arrays;

public class FrogJumpWithKSteps {
    static int memorization(int[] arr, int k){
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return helper(arr, arr.length - 1, dp, k);
    }
    static int helper(int[] arr, int index, int[] dp, int k){
        if(index == 0) return 0;
        if (dp[index] != -1) return dp[index];
        int minSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++){
            if(index - j >= 0){
                int steps = helper(arr, index - j, dp, k) + Math.abs(arr[index] - arr[index - j]);
                minSteps = Math.min(minSteps, steps);
            }
        }
        return dp[index] = minSteps;
    }
    static int tabulation(int[] arr, int k){
        int[] dp = new int[arr.length];
        dp[0] = 0;
        for (int i = 1; i < arr.length; i++){
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++){
                if(i - j >= 0){
                    int steps = dp[i - j] + + Math.abs(arr[i] - arr[i - j]);
                    minSteps = Math.min(steps,minSteps);
                }
            }
            dp[i] = minSteps;
        }
        return dp[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {30, 10, 60, 10, 60, 50};
        System.out.println(memorization(arr, 2));
        System.out.println(tabulation(arr, 2));
    }
}
