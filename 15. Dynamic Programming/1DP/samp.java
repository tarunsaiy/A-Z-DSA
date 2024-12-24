import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class samp {
    public static void main(String[] args) {
        int arr[] = {4,5,6,4,4};
        minimumOperations(arr);
    }
    static void minimumOperations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums) list.add(i);
        System.out.println(list);
        int cnt = 0;
        while (true){
            HashSet<Integer> set = new HashSet<>(list);
            System.out.println(set);
            if(set.size() == list.size()){
                break;
            }
            int n = Math.min(3, list.size());
            for(int i = 0; i < n; i++){
                int temp = list.remove(0);
                System.out.println(temp);
            }
            System.out.println(list);
            cnt += 1;
        }
//        return cnt;
    }
}
