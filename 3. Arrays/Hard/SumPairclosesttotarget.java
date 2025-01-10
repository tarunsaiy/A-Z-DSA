/*
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[],
        where a<=b whose sum is closest to target.
        Note: Return the pair in sorted order and if there are multiple such pairs
        return the pair with maximum absolute difference. If no such pair exists return an empty array.

        Input: arr[] = [5, 2, 7, 1, 4], target = 10
        Output: [2, 7]
        Explanation: As (4, 7) and (2, 7) both are closest to 10,
        but absolute difference of (2, 7) is 5 and (4, 7) is 3.
        Hence, [2, 7] has maximum absolute difference and closest to target.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairclosesttotarget {
    static List<Integer> sumClosest(int[] arr, int target){
        Arrays.sort(arr);
        List<Integer> L = new ArrayList<>();
        int i = 0, j = arr.length - 1, minDiff = Integer.MAX_VALUE, a = 0, b = 0;
        while (i < j){
            int sum = arr[i] + arr[j];
            int diff = target - sum;
            if(Math.abs(diff) < minDiff){
                a = arr[i]; b = arr[j];
                minDiff = diff;
            }
            if (sum < target) i += 1;
            else j -= 1;
        }
        L.add(a); L.add(b);
        return L;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 7, 1, 4};
        System.out.println(sumClosest(arr, 10));
    }
}
