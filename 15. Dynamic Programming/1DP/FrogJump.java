import java.util.Arrays;

public class FrogJump {
    static int memorization(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return function(arr, dp, arr.length - 1);
    }
    static int function(int[] arr, int[] dp, int index){
        if(index == 0) return 0;
        if(dp[index] != -1) return dp[index];
        int oneStep = function(arr, dp, index -1) + Math.abs(arr[index] - arr[index - 1]);
        int twoStep = Integer.MAX_VALUE;
        if(index > 1){
            twoStep = function(arr, dp, index - 2) + Math.abs(arr[index] - arr[index - 2]);
        }
        return dp[index] = Math.min(oneStep, twoStep);
    }


    static int tabulation(int[] arr){
        int[] dp = new int[arr.length];

        dp[0] = 0;
        for (int i = 1; i < arr.length; i++){
            int oneStep = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int twoStep = Integer.MAX_VALUE;
            if (i > 1){
                twoStep = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[arr.length - 1];
    }


    static int spaceOptimization(int[] arr){
        int prev1 = 0, prev2 = 0, curr = 0;
        for (int i = 1; i < arr.length; i++){
            int oneStep = prev1 + Math.abs(arr[i] - arr[i - 1]);
            int twoStep = Integer.MAX_VALUE;
            if(i > 1){
                twoStep = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            curr = Math.min(oneStep, twoStep);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        System.out.println(memorization(arr));
        System.out.println(tabulation(arr));
        System.out.println(spaceOptimization(arr));
    }
}
