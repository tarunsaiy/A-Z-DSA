public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        System.out.println(lowerBound(arr, 99));
    }
    static int lowerBound(int[] arr, int target){
//        arr value i.e greater than or equal to target
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) high = mid - 1;
            else low = mid + 1;
        }
        return (low > arr.length - 1) ? -1 : low;
    }
}
