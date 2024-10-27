import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i = 0;i < arr.length; i++){
            int startIndex = i;
            int smallnumber = smallIndex(arr,startIndex);
            int temp = arr[startIndex];
            arr[startIndex] = arr[smallnumber];
            arr[smallnumber] = temp;
        }
    }
    static int smallIndex(int[] arr,int startIndex){
        int small = startIndex;
        for(int i = startIndex; i < arr.length; i++){
            if(arr[i] < arr[small]) small = i;
        }
        return small;
    }
}
