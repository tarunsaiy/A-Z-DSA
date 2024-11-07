public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,9};
        System.out.println(binarySearch(arr, 6));
    }
    static boolean binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) low = mid + 1;
            else high = mid -1;
        }
        return false;
    }
}
