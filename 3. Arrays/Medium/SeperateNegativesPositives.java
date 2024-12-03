import java.util.ArrayList;
import java.util.Arrays;

public class SeperateNegativesPositives {
    public static void main(String[] args) {
        int[] arr = {7,8,6,-1,-3,1-5,-5,-8,-7,8,-7};
        System.out.println(Arrays.toString(seperate(arr)));
    }
    static int[] seperate(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] res = new int[arr.length];
        for (int i : arr){
            if(i < 0) neg.add(i);
            else pos.add(i);
        }
        if (pos.size() < neg.size()){
            for (int i = 0; i < pos.size(); i++){
                res[2 * i] = pos.get(i);
                res[2 * i + 1] = neg.get(i);
            }
            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++){
                res[index] = neg.get(i);
                index += 1;
            }
        }
        else{
            for (int i = 0; i < neg.size(); i++){
                res[2 * i] = neg.get(i);
                res[2 * i + 1] = pos.get(i);
            }
            int index = 2 * neg.size();
            for (int i = neg.size(); i < pos.size(); i++){
                res[index] = pos.get(i);
                index += 1;
            }
        }
        return res;
    }
}
