class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        // Phase 1: Find a candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify that the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Since the problem guarantees the majority element exists,
        // no need for an explicit check; we can directly return the candidate.
        return candidate;
    }
}
