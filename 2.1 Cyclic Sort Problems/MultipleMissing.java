import java.util.ArrayList;
import java.util.List;

public class MultipleMissing {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,4,6};
        System.out.println(multipleMissing(arr));
    }
    static List<Integer> multipleMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
        ArrayList<Integer> arl = new ArrayList<>();
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1) arl.add(index + 1);
        }
        return arl;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
