import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElem {
    public static void main(String[] args) {
         int[] nums = {4, 1 ,2};
         int[] nums2 = {1,3,4,2};
//        System.out.println(Arrays.toString(nextGreaterElement(nums)));
        System.out.println(Arrays.toString(nextGreaterElem(nums, nums2)));
    }
    static int[] nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--){
            int x = arr[i];
            while (!s.isEmpty() && s.peek() <= arr[i]) s.pop();
            if(s.isEmpty()) arr[i] = -1;
            else arr[i] = s.peek();
            s.push(x);
        }
        return arr;
    }
//    modification problem in leetcode
    static int[] nextGreaterElem(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int i = arr2.length - 1; i >= 0; i--){
            while (!s.isEmpty() && s.peek() <= arr2[i]) s.pop();
            if (s.isEmpty()) map.put(arr2[i], -1);
            else map.put(arr2[i], s.peek());
            s.push(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = map.get(arr1[i]);
        }
        return arr1;
    }

}
