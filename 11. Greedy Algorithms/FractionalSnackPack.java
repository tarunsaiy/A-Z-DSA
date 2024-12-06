import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalSnackPack {
    public static void main(String[] args) {

    }
    static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        double sum = 0;
        ArrayList<Combo> arr = new ArrayList<>();
        for (int i = 0; i < val.size(); i++) {
            arr.add(new Combo(val.get(i), wt.get(i)));
        }
        capacityCompare obj = new capacityCompare();
        Collections.sort(arr, obj);
        int weight = 0;
        for (int i = 0; i < arr.size(); i++){
            if(weight + arr.get(i).weight <= capacity){
                weight += arr.get(i).weight;
                sum += arr.get(i).value;
            }
            else {
                int req = capacity - weight;
                sum += (double) arr.get(i).value / (double) arr.get(i).weight * (double) req;
                break;
            }
        }
        return sum;
    }
}
class Combo{
    int value;
    int weight;
    Combo(int value, int weight){
        this.value = value;
        this.weight = weight;
    }
}
class capacityCompare implements Comparator<Combo>{
    public int compare(Combo a, Combo b){
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if(r1 < r2) return 1;
        else if (r1 > r2) return -1;
        return 0;
    }
}