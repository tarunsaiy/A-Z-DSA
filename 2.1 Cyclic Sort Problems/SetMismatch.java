import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
       int[] arr = {1,1,2,3};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }
    static int[] setMismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        int repeating = -1, missing = -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                missing = index + 1;
                repeating = arr[index];
                break;
            };
        }

        return new int[]{repeating, missing};
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
