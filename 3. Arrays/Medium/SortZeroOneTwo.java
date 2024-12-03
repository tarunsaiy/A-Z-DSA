import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,0,2,1,2,0,1,2,0,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low += 1;
                mid += 1;
            }
            else if(arr[mid] == 1){
                mid += 1;
            }
            else {
                swap(arr, mid, high);
                high -= 1;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
