/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        long X = (long) x;
        long low = 1;
        long high = x / 2 + 1 ;

        while (low <= high) {
            long mid = (high + low) / 2;
            long midSquared = mid * mid;

            if (midSquared < X) {
                low = mid + 1;
            } else if (midSquared > X) {
                high = mid - 1;
            } else {
                return (int) mid;
            }
        }

        return (int) high;
    }
}
// @lc code=end

