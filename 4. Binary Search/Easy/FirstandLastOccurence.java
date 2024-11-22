import java.util.Arrays;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,5,9};
        System.out.println(Arrays.toString(firstAndLast(arr, 5)));
    }
    static int[] firstAndLast(int[] arr, int target){
        int i = first(arr, target);
        int j = last(arr, target);
        return new int[]{i , j};
    }
    static int first(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return ans;
    }
    static int last(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return ans;
    }
}
