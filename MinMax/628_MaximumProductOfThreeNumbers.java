/*
LeetCode Problem 628: Maximum Product of Three Numbers
Category: Min/Max

Description:
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6

Example 2:
Input: nums = [1,2,3,4]
Output: 24

Example 3:
Input: nums = [-100,-98,-1,2,3,4]
Output: 39200

Constraints:
- 3 <= nums.length <= 10^4
- -1000 <= nums[i] <= 1000
*/

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int case1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // 3 largest
        int case2 = nums[0] * nums[1] * nums[n - 1];         // 2 smallest + largest

        return Math.max(case1, case2);
    }
}
