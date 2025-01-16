class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                // Swap nums[current] and nums[low]
                int temp = nums[current];
                nums[current] = nums[low];
                nums[low] = temp;

                low++;
                current++;
            } else if (nums[current] == 2) {
                // Swap nums[current] and nums[high]
                int temp = nums[current];
                nums[current] = nums[high];
                nums[high] = temp;

                high--;
            } else {
                // nums[current] is 1, just move current
                current++;
            }
        }
    }
}
