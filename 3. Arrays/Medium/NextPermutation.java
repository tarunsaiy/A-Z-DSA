import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,1,2};
        System.out.println(Arrays.toString(permutation(arr)));
    }
    static int[] permutation(int[] arr){
        int pivot = -1;
        for (int i = arr.length - 2; i >= 0; i--){
            if (arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }
        if (pivot == -1) reverse(arr, 0, arr.length -1);
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] > arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        reverse(arr, pivot + 1, arr.length - 1) ;
        return arr;
    }
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
