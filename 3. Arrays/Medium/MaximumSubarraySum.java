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
