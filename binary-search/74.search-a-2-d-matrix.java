/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int element = matrix[mid / col][mid % col];
            
            if (element == target) {
                return true;
            } else if (target < element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
        
    }
}
// @lc code=end

