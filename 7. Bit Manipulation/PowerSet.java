import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int nums[] = {4,5,6};
        System.out.println(powerSet(nums));
    }
    static List<List<Integer>> powerSet(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < (1 << nums.length); i++){
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++){
                if((i & (1 << j)) != 0) temp.add(nums[j]);
            }
            list.add(temp);
        }
        return list;
    }
}
