/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] {++start, ++end};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {};
    }
}
// @lc code=end

