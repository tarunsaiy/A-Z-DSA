import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,7,2,3};
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
