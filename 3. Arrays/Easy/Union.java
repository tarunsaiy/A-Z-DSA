import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,9};
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]){
                    arr.add(arr1[i]);
                }
                i++;
            }
            else{
                if(arr.isEmpty() || arr.get(arr.size() - 1) != arr2[j]){
                    arr.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < arr1.length){
            if(arr.get(arr.size() - 1) != arr1[i]){
                arr.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length){
            if(arr.get(arr.size() - 1) != arr2[j]){
                arr.add(arr2[j]);
            }
            j++;
        }
        System.out.println(arr);
    }
}
