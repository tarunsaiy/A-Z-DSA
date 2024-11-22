public class UpperBound {
    public static void main(String[] args) {
        int [] arr = {1,5,6,9,12};
        System.out.println(upperBound(arr, 9));
    }
    static int upperBound(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return (low > arr.length - 1) ? -1 : arr[low];
    }
}
