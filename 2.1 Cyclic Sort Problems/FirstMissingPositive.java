//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
// LEETCODE - 41

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{7,8,2,1}));
    }
    static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i += 1;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) return j + 1;
        }
        return arr.length + 1;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
