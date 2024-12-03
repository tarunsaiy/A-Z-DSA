public class BestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1,9};
        System.out.println(bestTime(arr));
    }
    static int bestTime(int[] arr){
        int max = 0, min = arr[0];
        for (int i : arr){
            int cost = i - min;
            max = Math.max(max, cost);
            min = Math.min(min, i);
        }
        return max;
    }
}
