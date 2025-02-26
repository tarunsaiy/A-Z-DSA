public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-4,5,-1,-2,3,-1,6,0};
        System.out.println(maximumSubArraySum(arr));
    }
    static int maximumSubArraySum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            else if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}

//Follow up question
//LEETCODE : 1749
/*
You are given an integer array nums. The absolute sum of a subarray
Example 1:

Input: nums = [1,-3,2,3,-4]
Output: 5
Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
Example 2:

Input: nums = [2,-5,1,-4,3,-2]
Output: 8
Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.

*/

class Follow{
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum = 0, minPrefixSum = 0, maxPrefixSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            minPrefixSum = Math.min(minPrefixSum, prefixSum);
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);
        }
        return maxPrefixSum - minPrefixSum;
    }
}