import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length- 1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> arl = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                arl.add(arr[i]);
                i++;
            }
            else{
                arl.add(arr[j]);
                j++;
            }
        }
        while(i <= mid){
            arl.add(arr[i]);
            i++;
        }
        while (j <= high){
            arl.add(arr[j]);
            j++;
        }
        for(int it = low; it <= high; it++){
            arr[it] = arl.get(it - low);
        }
    }
}
