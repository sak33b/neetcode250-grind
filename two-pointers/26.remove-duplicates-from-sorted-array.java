/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int prev = 0;
        int next = 1;

        int k = 1;
        while (prev < nums.length && next < nums.length) {
            if (nums[next] <= nums[prev]) {
                next++;
            } else {
                prev++;
                swap(nums, prev, next);
                k++;
            }
        }
        return k;
    }

    private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
// @lc code=end

