public class MaximumPointsCanObtain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        System.out.println(maximumPoints(arr, 3));
    }
    static int maximumPoints(int[] arr, int k){
        int rightSum = 0, leftSum = 0, maxSum = 0;
        for(int i = 0; i < k; i++){
            leftSum += arr[i];
        }
        maxSum = leftSum;
        int index = arr.length - 1;
        for (int i = k - 1; i >= 0; i--){
            leftSum -= arr[i];
            rightSum += arr[index];
            maxSum = Math.max(maxSum, leftSum + rightSum);
            index -= 1;
        }
        return maxSum;
    }
}
