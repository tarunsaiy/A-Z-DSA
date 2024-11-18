public class NumberAppearOddtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        System.out.println(numberAppearOddTimes(arr));
    }
    static int numberAppearOddTimes(int[] arr){
        int ans = 0;
        for (int i : arr) ans ^= i;
        return ans;
    }
}
