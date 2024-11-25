import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElem {
    public static void main(String[] args) {
        int[] arr = {5,7,9,6,7,4,5};
        System.out.println(Arrays.toString(nextSmallerElem(arr)));
    }
    static int[] nextSmallerElem(int[] arr){
        Stack<Integer> s = new Stack<>();
        for (int i = 0;i < arr.length; i++){
            int val = arr[i];
            while (!s.isEmpty() && s.peek() >= arr[i]) s.pop();
            arr[i] = s.isEmpty() ? -1 : s.peek();
            s.push(val);
        }
        return arr;
    }
}
