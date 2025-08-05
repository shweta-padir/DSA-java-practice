class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // points to the next position to insert a non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; // new length of array without val
    }
}
