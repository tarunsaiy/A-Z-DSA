import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }
    static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if(!dq.isEmpty() && dq.peek() <= i - k) dq.poll();
            while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) dq.pollLast();
            dq.offer(i);
            if (i >= k - 1){
                arr.add(nums[dq.getFirst()]);
            }
        }
        return arr.stream().mapToInt(ind -> ind).toArray();
    }
}
