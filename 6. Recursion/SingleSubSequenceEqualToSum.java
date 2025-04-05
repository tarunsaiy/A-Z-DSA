import java.util.ArrayList;
import java.util.List;

public class SingleSubSequenceEqualToSum {
    static List<List<Integer>> list = new ArrayList<>();
    static List<List<Integer>> subsequence(int[] A, int target){
        List<Integer> sublist = new ArrayList<>();
        helper(0, A, target, 0, sublist);
        return list;
    }
    static boolean helper(int index, int[] A, int target, int sum, List<Integer> sublist){
        if (index == A.length){
            if(sum == target) {
                list.add(new ArrayList<>(sublist));
                return true;
            }
            return false;
        }
        sublist.add(A[index]);
        sum += A[index];
        if (helper(index + 1, A, target, sum, sublist) == true) return true;
        sum -= A[index];
        sublist.remove(sublist.size() - 1);
        if (helper(index + 1, A, target, sum, sublist) == true) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1,2,1};
        System.out.println(subsequence(A, 4));
    }
}
