import java.util.Stack;

public class MaximumHistogramRectangle {
    public static void main(String[] args) {
        int[] arr = {3,2,10,11,5,10,6,3};
        System.out.println(maximumHistogram(arr));
    }
    static int maximumHistogram(int[] arr){
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] > arr[i]){
                int elem = s.peek();
                s.pop();
                int nse = i;
                int pse = s.isEmpty() ? -1 : s.peek();
                max = Math.max(max, arr[elem] * (nse - pse - 1));
            }
            s.push(i);
        }
        while (!s.isEmpty()){
            int elem = s.peek();
            s.pop();
            int nse = arr.length;
            int pse = s.isEmpty() ? -1 : s.peek();
            max = Math.max(max, arr[elem] * (nse - pse - 1));
        }
        return max;
    }
}
