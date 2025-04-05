public class Sum_of_all_subset_xor_totals {
    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(f(nums, 0, 0));
    }
    static int f(int[] nums, int ind, int xor) {
        if (ind == nums.length) return xor;
        int take = f(nums, ind + 1, xor ^ nums[ind]);
        int skip = f(nums, ind + 1, xor);
        return skip + take;
    }
//    static int f1(int[] nums) {
//        int or = 0;
//        for (int i : nums) or |= i;
//        return or << (nums.length - 1);
//    }
}
