public class Ceil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.println(ceil(arr, 5));
    }
    static int ceil(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) high = mid - 1;
            else low = mid + 1;
        }
        return arr[low];
    }
}
