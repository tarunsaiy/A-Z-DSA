/*
* Given a sorted array arr[] and a target value, the task is to
*  count triplets (i, j, k) of valid indices,
* such that arr[i] + arr[j] + arr[k] = target and i < j < k.
*
* Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
Output: 4
Explanation: Two triplets that add up to -2 are:
arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
*
* */
public class CountTripletsEqualToSum {
    static int countTriplets(int[] arr,int target){
        int n = arr.length, cnt = 0;
        for (int i = 0; i < n; i++){
            int j = i + 1, k = n - 1;
            while (j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < target) j += 1;
                else if (sum > target) k -= 1;
                else {
                    int el1 = arr[j], el2 = arr[k];
                    int cnt1 = 0, cnt2 = 0;
                    while (j <= k && arr[j] == el1){
                        j += 1; cnt1 += 1;
                    }
                    while (j <= k  && arr[k] == el2){
                        k -= 1; cnt2 += 1;
                    }
                    if (el1 == el2) cnt = (cnt1 * (cnt1 - 1)) / 2;
                    else cnt = cnt1 * cnt2;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}

