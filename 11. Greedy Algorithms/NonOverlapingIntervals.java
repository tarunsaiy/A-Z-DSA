import java.util.Arrays;
import java.util.Comparator;

public class NonOverlapingIntervals {
    public static void main(String[] args) {
       int[][] arr = {{1,2},{1,2},{1,2}};
        System.out.println(nonOverlapingIntervals(arr));
    }
    static int nonOverlapingIntervals(int[][] arr){
        int cnt = 1;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int lastInterval = arr[0][1];
        for (int i = 1; i < arr.length; i++){
            if(arr[i][0] >= lastInterval){
                cnt += 1;
                lastInterval = arr[i][1];
            }
        }
        return arr.length - cnt;
    }
}
