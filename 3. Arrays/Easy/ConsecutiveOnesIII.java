public class ConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,0,1,1,0,1};
        int k = 2;
//        you can flip kth zeroes anf find longest consecutive sequence of 1
        int left = 0, max_length = 0, zero_cnt = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zero_cnt += 1;
            while (zero_cnt > k) {
                if (nums[left] == 0) zero_cnt -= 1;
                left += 1;
            }
            max_length = Math.max(max_length, right - left + 1);
        }
        System.out.println(max_length);
    }
}
