import java.util.Arrays;

public class BasicHashingAlpha {
    public static void main(String[] args) {
        int hasharr[] = new int[26];
        char arr[] = {'a','a','a','g','c','z','z'};
        for(int i = 0; i < arr.length; i++){
            int index = arr[i] - 'a';
            hasharr[index] += 1; 
        }
        System.out.println(Arrays.toString(hasharr));
        // fff
    }
}
