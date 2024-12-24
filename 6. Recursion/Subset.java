import java.util.ArrayList;
import java.util.List;

public class Subset {
    static List<List<Integer>> list = new ArrayList<>();
    static List<List<Integer>> subset(int[] A){
        List<Integer> sublist = new ArrayList<>();
        subsequence(0, A, sublist);
        return list;
    }
    static void subsequence(int index, int[] A, List<Integer> sublist){
        if(index == A.length){
            list.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(A[index]);
        subsequence(index + 1, A, sublist);
        sublist.remove(sublist.size() - 1);
        subsequence(index + 1, A, sublist);
    }

    public static void main(String[] args) {
        int[] A = {3,1,2};
        System.out.println(subset(A));
    }
}
