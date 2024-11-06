import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,8,2,3,4,4,5,6,8};
        Arrays.sort(arr);
        int ans = removeduplicates(arr);
        for(int i = 0; i <= ans; i++) System.out.print(arr[i] + " ");
    }
    static int removeduplicates(int[] arr){
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                arr[index + 1] = arr[i + 1];
                index++;
            }
        }
        return index;
    }
}
