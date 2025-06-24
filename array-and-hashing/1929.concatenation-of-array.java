/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length * 2];
        for (int i = 0; i < array.length; i++ ) {
            array[i] = nums[i % nums.length];
        }
        return array;
    }
}
// @lc code=end

 