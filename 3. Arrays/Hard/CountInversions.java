public class CountInversions {

        public long numberOfInversions(int[] nums) {
            long cnt[] = {0};
            mergeSort(nums, 0, nums.length - 1, cnt);
            return cnt[0];
        }
        private void mergeSort(int[] nums, int low, int high, long[] cnt) {
            if (low >= high) return;
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid, cnt);
            mergeSort(nums, mid + 1, high, cnt);
            merge(nums, low, mid, high, cnt);

        }
        private void merge(int[] nums, int low,int mid, int high, long[] cnt) {
            int i = low, j = mid + 1;
            List<Integer> list = new ArrayList<>();
            while (i <= mid && j <= high) {
                if (nums[i] <= nums[j]) {
                    list.add(nums[i]); i += 1;
                }
                else {
                    cnt[0] += mid - i + 1;
                    list.add(nums[j]); j += 1;
                }
            }
            while (i <= mid) list.add(nums[i++]);
            while (j <= high) list.add(nums[j++]);
            for (int it : list) nums[low++] = it;
        }
    }

