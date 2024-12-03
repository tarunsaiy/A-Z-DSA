import java.util.HashMap;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int[] arr = {5,5,2 ,1 ,2,2,2};
        System.out.println(fruitIntoBasket(arr,2));
    }
    static int fruitIntoBasket(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int r = 0, l = 0, n = arr.length,max = 0;
        while (r < n){
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            if(map.size() > k){
                map.put(arr[l], map.get(arr[l]) - 1);
                if(map.get(arr[l]) == 0) map.remove(arr[l]);
                l += 1;
            }
            if(map.size() <= k){
                max = Math.max(max, r - l + 1);
            }
            r += 1;
        }
        return max;
    }
}
