import java.util.ArrayList;
import java.util.List;

public class MultipleRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5};
        System.out.println(multipleRepeatingNumbers(arr));
    }
    static List<Integer> multipleRepeatingNumbers(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
        List<Integer> arl = new ArrayList<>();
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1) arl.add(arr[index]);
        }
        return arl;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
