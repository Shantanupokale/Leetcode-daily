class Solution {
    public int singleNumber(int[] nums) {
        // Initialize the result variable to 0
        int result = 0;

        // Traverse the entire array
        for (int i = 0; i < nums.length; i++) {
            // Update result using XOR operation with the current element
            result = result ^ nums[i];
        }

        // Return the result, which now contains the single number
        return result;
    }
}
