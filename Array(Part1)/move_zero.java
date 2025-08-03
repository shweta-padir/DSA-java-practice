class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // pointer to track where to put the next non-zero
        
        // First pass: move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Second pass: fill remaining elements with zero
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}