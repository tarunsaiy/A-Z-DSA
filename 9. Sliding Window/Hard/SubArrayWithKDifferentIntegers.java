
//Given an integer array nums and an integer k, return the number of good subarrays of nums.
//
//A good array is an array where the number of different integers in that array is exactly k.
//
//For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
//A subarray is a contiguous part of an array.
//
//
//
//Example 1:
//
//Input: nums = [1,2,1,2,3], k = 2
//Output: 7
//Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
//Example 2:
//
//Input: nums = [1,2,1,3,4], k = 3
//Output: 3
//Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].

import java.util.HashMap;

public class SubArrayWithKDifferentIntegers {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        System.out.println(subarray(arr, 2));
    }
    static int subarraywithKdifferentIntegers(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0, cnt = 0;
        while (r < arr.length){
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while (map.size() > k){
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) map.remove(arr[l]);
                l += 1;
            }
            cnt += r - l + 1;
            r += 1;
        }
        return cnt;
    }
    static int subarray(int[] arr, int k){
        return subarraywithKdifferentIntegers(arr, k) - subarraywithKdifferentIntegers(arr, k - 1);
    }
}
