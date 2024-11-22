public class PeakElem {
    public static void main(String[] args) {
        int[] arr = {4,5,5,5,5,6,1,2,3};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int low = 0, high = arr.length - 1;
        while (low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return arr[high];
    }
}
