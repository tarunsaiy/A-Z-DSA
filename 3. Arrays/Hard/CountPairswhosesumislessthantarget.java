/*
Given an array arr[] and an integer target. You have to find the number
of pairs in the array whose sum is strictly less than the target.

Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
Output: 4
Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).
*/
import java.util.Arrays;

public class CountPairswhosesumislessthantarget {
    static int countPairs(int arr[], int target) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            int required = target - arr[i];
            int j = 0;
            while (j < arr.length){
                if (arr[j] < required){
                    count += 1; j += 1;
                }
                else break;
            }
        }
        return count;
    }
}
