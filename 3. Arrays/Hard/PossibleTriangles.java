/*
Given an integer array arr[]. Find the number of triangles that can be formed
        with three different array elements as lengths of three sides of the triangle.

        A triangle with three given sides is only possible if sum of any two
        sides is always greater than the third side.

        Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
        Output: 6
        Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101],
        [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]

*/
import java.util.Arrays;

public class PossibleTriangles {
    static int possibleTrianle(int[] arr){
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = arr.length - 1; i >= 2; i--){
            int j = i - 1, k = 0;
            while (k < j){
                if (arr[k] + arr[j] > arr[i]){
                    cnt += j - k; j -= 1;
                }
                else k += 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(possibleTrianle(arr));
    }
}
