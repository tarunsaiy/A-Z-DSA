import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
       char arr[][] = {{'0','1','1','1'},{'0','1','1','1'},{'0','1','1','1'},{'0','0','0','0'}};
        System.out.println(maximumRectangle(arr));
    }
    static int maximumRectangle(char[][] nums){
        int[][] arr = convert(nums);
        for (int j = 0; j < arr[0].length; j++){
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i][j];
                if(arr[i][j] == 0) sum = 0;
                arr[i][j] = sum;
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, max_histogram(arr[i]));
        }
        return max;
    }
    static int[][] convert(char[][] nums){
        int[][] arr = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                arr[i][j] = Character.getNumericValue(nums[i][j]);
            }
        }
        return arr;
    }
    static int max_histogram(int[] arr){
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] > arr[i]){
                int nse = i;
                int elem = s.peek();
                s.pop();
                int pse = s.isEmpty() ? - 1 : s.peek();
                max = Math.max(max, arr[elem] * (nse - pse - 1));
            }
            s.push(i);
        }
        while (!s.isEmpty()){
            int nse = arr.length;
            int elem = s.peek();
            s.pop();
            int pse = s.isEmpty() ? -1 : s.peek();
            max = Math.max(max, arr[elem] * (nse - pse - 1));
        }
        return max;
    }
}
