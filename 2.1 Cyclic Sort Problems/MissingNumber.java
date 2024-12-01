public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int currectIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[currectIndex]){
                swap(arr, i, currectIndex);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1) return index + 1;
        }
        return arr.length + 1;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
