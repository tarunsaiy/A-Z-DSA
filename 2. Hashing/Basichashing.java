import java.util.Arrays;

public class Basichashing {
    public static void main(String[] args) {
        int hasharray[] = new int[10];
        int arr[] = {1,2,3,3,3,5,6,6,7,8};
        for(int i = 0; i < arr.length; i++){
            hasharray[arr[i]] += 1;
        }
        System.out.println(Arrays.toString(hasharray));
    }
}
