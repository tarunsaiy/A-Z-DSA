public class CheckArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5};
        System.out.println(checkSorted(arr));
    }
    static boolean checkSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
