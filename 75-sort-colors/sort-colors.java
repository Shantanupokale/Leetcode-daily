class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count occurrences of 0, 1, and 2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Fill the array with the counts
        int index = 0;

        //Fill 0s
        for (int i = 0; i < count0; i++) {
        nums[index] = 0;
        index++;
        }

        // Fill 1s
        for (int i = 0; i < count1; i++) {
            nums[index] = 1;
            index++;
        }

        // Fill 2s
        for (int i = 0; i < count2; i++) {
            nums[index] = 2;
            index++;
        }
    }
}
