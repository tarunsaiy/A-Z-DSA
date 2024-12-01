public class RepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        System.out.println(repeatingNumber(arr));
    }
    static int repeatingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i += 1;
            }
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1) return arr[index];
        }
        return 0;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
