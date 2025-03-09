class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] arr = new int[colors.length + k - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = colors[i % colors.length];
        }
        int cnt = 0, left = 0, right = 1;
        while (right < arr.length) {
            if (arr[right] == arr[right - 1]) {
                left = right;
            }
            else if (right - left + 1 == k) {
                cnt += 1;
                left += 1;
            }
            right += 1;
        }
        return cnt;
    }
}