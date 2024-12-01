public class CountNumberOfSubArraysEqualToTarget {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        System.out.println(totalCount(arr, 2));
    }
    static int noOfSubarray(int[] arr, int target){
        int l = 0, r = 0, n = arr.length, sum = 0, ans = 0;
        while (r < n){
            sum += arr[r];
            while (sum > target){
                sum -= arr[l];
                l += 1;
            }
            ans += r - l + 1;
            r += 1;
        }
        return ans;
    }
    static int totalCount(int[] arr, int target){
        return noOfSubarray(arr, target) - noOfSubarray(arr, target - 1);
    }
}
