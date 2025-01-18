class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Find the candidate for the majority element
        int candidate = nums[0];
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        
        // Step 2: Validate the candidate
        count = 0; // Reset the count for validation
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            }
        }
        
        // Since the problem guarantees a majority element, return the candidate
        return candidate;
    }
    
}
