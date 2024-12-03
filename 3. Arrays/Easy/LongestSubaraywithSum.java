import java.util.HashMap;

public class LongestSubaraywithSum {
    public static void main(String[] args) {
        int[] arr = {4,6,3,1,2,9,1,0,8,5,3,1,0,1};
        System.out.println(longestSubArray(arr, 10));
    }
    static int longestSubArray(int[] arr, int k){
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) max = i + 1;
            int req = sum - k;
            if(map.containsKey(req)){
                int len = i - map.get(req);
                max = Math.max(max, len);
            }
            if(!map.containsKey(req)){
                map.put(sum, i);
            }
        }
        return max;
    }
}
