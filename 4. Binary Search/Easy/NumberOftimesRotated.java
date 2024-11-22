public class NumberOftimesRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(noOfTimesRotated(arr));
    }
    static int noOfTimesRotated(int[] arr){
        int ans = Integer.MAX_VALUE;
        int low = 0, high = arr.length - 1;
        int index = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[low] < arr[high]){
                if(arr[low] < ans){
                    index = low;
                    break;
                }
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            else {
                if(arr[mid] < ans){
                    ans = arr[mid];
                    index = mid;

                }
                high = mid - 1;
            }
        }
        return index;
    }
}
