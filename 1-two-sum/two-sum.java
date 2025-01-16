class Solution {
    public int[] twoSum(int[] nums, int target) {

        int arr[]= new int [2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++){

            Integer value = map.get(target - nums[i]);

            if(value==null){
                map.put(nums[i] , i);
            } else {
                arr[0] = i;
                arr[1] = value;
            }
        }  return arr;
    }
}


// nums = [2, 7, 11, 15], target = 9
// Step-by-Step Execution:
// Iteration 1 (i = 0, nums[i] = 2):

// Complement = 9 - 2 = 7.
// map.get(7) → Not found (null).
// Add 2 to map → map = {2: 0}.
// Iteration 2 (i = 1, nums[i] = 7):

// Complement = 9 - 7 = 2.
// map.get(2) → Found (0).
// Store indices → arr = [1, 0].
// Stop Iteration (valid pair found).