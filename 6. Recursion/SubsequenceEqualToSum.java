import java.util.ArrayList;
import java.util.List;

public class SubsequenceEqualToSum {
    static List<List<Integer>> list = new ArrayList<>();
    static List<List<Integer>> subsequence(int[] A, int target){
        List<Integer> sublist = new ArrayList<>();
        helper(0, A, target, 0, sublist);
        return list;
    }
    static void helper(int index, int[] A, int target, int sum, List<Integer> sublist){
        if (index == A.length){
            if(sum == target) list.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(A[index]);
        sum += A[index];
        helper(index + 1, A, target, sum, sublist);
        sum -= A[index];
        sublist.remove(sublist.size() - 1);
        helper(index + 1, A, target, sum, sublist);
    }

    public static void main(String[] args) {
        int[] A = {6,2,1,-1,-2};
        System.out.println(subsequence(A, 0));
    }
}
