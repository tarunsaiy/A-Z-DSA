public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3,4};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[low] < arr[high]){
                ans = Math.min(ans, arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.max(ans, arr[low]);
                low = mid + 1;
            }
            else {
                ans = Math.min(ans, arr[mid]);
                low = mid - 1;
            }
        }
        return ans;
    }
}
