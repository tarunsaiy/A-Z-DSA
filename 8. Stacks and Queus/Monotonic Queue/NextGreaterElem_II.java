import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElem_II {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,3,5};
        System.out.println(Arrays.toString(nextGreaterElem(arr)));
    }
    static int[] nextGreaterElem(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        for (int i = 2 * n - 1; i >= 0; i--){
            int val = arr[i % n];
            while (!s.isEmpty() && s.peek() <= arr[i % n]) s.pop();
            if(i < n){
                arr[i % n] = s.isEmpty() ? -1 : s.peek();
            }
            s.push(val);
        }
        return arr;
    }
}
