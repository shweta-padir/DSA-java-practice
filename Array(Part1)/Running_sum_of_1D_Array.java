Problem Statement (in easy words):
You have an array of numbers. You need to create a new array where each element is the sum of all numbers from the start up to that position.

Example:

yaml
Copy
Edit
Input:  nums = [1, 2, 3, 4]
Output: [1, 3, 6, 10]
Explanation:  
First element: 1  
Second element: 1 + 2 = 3  
Third element: 1 + 2 + 3 = 6  
Fourth element: 1 + 2 + 3 + 4 = 10

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
        
    }
}