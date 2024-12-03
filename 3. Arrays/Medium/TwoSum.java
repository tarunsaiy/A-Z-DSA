import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4,6,5,8,2};
        System.out.println(Arrays.toString(twoSum(arr, 7)));
    }
    static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = arr[i];
            int req = target - sum;
            if(map.containsKey(req)) return new int[]{map.get(req), i};
            map.put(sum, i);
        }
        return new int[]{-1,-1};
    }
}
