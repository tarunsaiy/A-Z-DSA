public class Countoccurences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,5,5,9};
        System.out.println(countOccurences(arr, 3));
    }
    static int countOccurences(int[] arr, int target){
        int ans = last(arr, target) - first(arr, target) + 1;
        return ans;
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
