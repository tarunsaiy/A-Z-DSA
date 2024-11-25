import java.util.Arrays;
import java.util.Stack;

public class MinimumSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(maxsubarraySum(arr) - minsubarraySum(arr));
    }
    static int[] nextSmallerElem(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = arr.length - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) s.pop();
            ans[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        return ans;
    }
    static int[] nextGreaterElem(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = arr.length - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) s.pop();
            ans[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        return ans;
    }
    static int[] prevSmallerElem(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++){
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) s.pop();
            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return ans;
    }
    static int[] prevGreaterElem(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++){
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) s.pop();
            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return ans;
    }
    static int minsubarraySum(int[] arr){
        int pse[] = prevSmallerElem(arr);
        int nse[] = nextSmallerElem(arr);
        int mod = (int)(1e9 + 7);
        long total = 0;
        for (int i = 0; i < arr.length; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + (long) left * right * 1l * arr[i]) % mod;
        }
        return (int) total;
    }
    static int maxsubarraySum(int[] arr){
        int pse[] = prevGreaterElem(arr);
        int nse[] = nextGreaterElem(arr);
        int mod = (int)(1e9 + 7);
        long total = 0;
        for (int i = 0; i < arr.length; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + (long) left * right * 1l * arr[i]) % mod;
        }
        return (int) total;
    }
}
