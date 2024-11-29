public class MaximumOnesIII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maximum_Ones(arr, 2));
    }
    static int maximum_Ones(int[] arr, int k){
        int l = 0, r = 0, max = 0, n = arr.length;
        int zeroCount = 0;
        while (r < n){
            if(arr[r] == 0) zeroCount += 1;
            if(zeroCount > k){
                if(arr[l] == 0) zeroCount -= 1;
                l += 1;
            }
            if(zeroCount <= k) max = Math.max(max, r - l + 1);
            r += 1;
        }
        return max;
    }
}
