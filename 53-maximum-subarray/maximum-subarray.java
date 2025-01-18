class Solution {
    public int maxSubArray(int[] nums) {
        // Variable to keep track of the current subarray sum
        int currentsum = 0;
        // Variable to store the maximum subarray sum found so far
        int maxsum = Integer.MIN_VALUE;

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current subarray sum
            currentsum += nums[i];
            // Update the maximum sum if the current subarray sum is greater
            maxsum = Math.max(currentsum, maxsum);

            // If the current subarray sum becomes negative, reset it to 0
            // This is because a negative sum would reduce the total sum of any new subarray
            if (currentsum < 0) {
                currentsum = 0;
            }
        }

        // Return the maximum sum of any subarray found
        return maxsum;
    }
}
