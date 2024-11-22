public class Search2 {
    public static void main(String[] args) {

    }
    static int search2(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return mid;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low += 1;
                high -= 1;
            }
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target <= arr[mid]){
                    high = mid -1;
                }
                else low = mid + 1;
            }
            else {
                if(target >= arr[mid] && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
