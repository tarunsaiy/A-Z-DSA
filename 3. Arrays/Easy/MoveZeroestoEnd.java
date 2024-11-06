import java.util.Arrays;

public class MoveZeroestoEnd {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,0,0,0,5,5,0,6};
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index += 1;
            }
        }
        for(int i = index; i < arr.length; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
