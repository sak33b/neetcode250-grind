/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;

        while (start < end) {
            int area = Math.min(height[start], height[end]) * Math.abs(end - start);
            if (area > max) {
                max = area;
            }

            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
        
    }
}
// @lc code=end

