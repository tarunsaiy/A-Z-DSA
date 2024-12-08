import java.util.*;

public class samp2 {
    static List<List<Integer>> findDifference(int[] nums1) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1){
            set.add(i);
        }
        return Arrays.asList(List.copyOf(set), List.copyOf(set));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findDifference(arr));
    }
}
