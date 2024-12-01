import java.util.HashMap;

public class CountNIceSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        System.out.println(countNiceSubarrays(arr, 3));
    }
    static int countNiceSubarrays(int[] arr, int k){
//        Given an array of integers nums and an integer k.
//        A continuous subarray is called nice if there are k odd numbers on it.
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, cnt = 0;
        for (int i : arr){
            sum += i % 2;
            int req = sum - k;
            cnt += map.getOrDefault(req, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
