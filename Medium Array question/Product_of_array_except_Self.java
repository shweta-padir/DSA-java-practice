class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = 1;   // (A)

        int left = 1;                              // (B)
        for (int i = 0; i < n; i++) {              // (C) Left pass
            ans[i] = left;                         // (C1)
            left *= nums[i];                       // (C2)
        }

        int right = 1;                             // (D)
        for (int i = n - 1; i >= 0; i--) {         // (E) Right pass
            ans[i] *= right;                       // (E1)
            right *= nums[i];                      // (E2)
        }

        return ans;                                // (F)
    }
}
