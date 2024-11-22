public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 8));
    }
    static int binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
