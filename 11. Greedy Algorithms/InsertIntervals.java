import java.util.ArrayList;
import java.util.Arrays;

public class InsertIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        System.out.println(Arrays.toString(insert(arr, newInterval)));
    }
    static int[][] insert(int[][] arr, int[] newInterval){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int start = 0, end = 1;
        int i = 0, n = arr.length;
        while (i < n && arr[i][end] < newInterval[start]){
            ans.add(new ArrayList<>(Arrays.asList(arr[i][start], arr[i][end])));
            i += 1;
        }
        while (i < n && arr[i][start] <= newInterval[end]){
            newInterval[start] = Math.min(newInterval[start], arr[i][start]);
            newInterval[end] = Math.max(newInterval[end], arr[i][end]);
            i += 1;
        }
        ans.add(new ArrayList<>(Arrays.asList(newInterval[start], newInterval[end])));
        while (i < n){
            ans.add(new ArrayList<>(Arrays.asList(arr[i][start], arr[i][end])));
            i += 1;
        }
        int[][] res = new int[ans.size()][ans.get(0).size()];
        for (int ii = 0; ii < res.length; ii++){
            for (int j = 0; j < res[0].length; j++){
                res[ii][j] = ans.get(ii).get(j);
            }
        }
        return res;
    }
}
