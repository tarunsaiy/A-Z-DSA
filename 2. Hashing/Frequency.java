import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,2,2,2,3};
        for(int i = 0;i < arr.length; i++){
            int freq = 0;
            if(map.containsKey(arr[i])){
                freq = map.get(arr[i]);
            }
            map.put(arr[i], freq += 1);
        }
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            System.out.println(i.getValue());
        }
    }
}
