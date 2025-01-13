class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int n= nums.length;
    int count = 0;
    int max= 0;

        for (int i = 0; i <n ; i++) {
            if (nums[i] == 1) {
                count++;        // Increment count for each 1
                max = Math.max(max, count); // Update max if necessary
            } else {
                count = 0;      // Reset count when encountering a 0
            }
        }
        return max;
    } 
}