#
# @lc app=leetcode id=50 lang=python3
#
# [50] Pow(x, n)
#

# @lc code=start
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1

        if n == -1:
            return 1 / x

        half = self.myPow(x, n // 2)
        half_squared = half * half

        if n % 2 == 0:
            return half_squared
        else:
            return x * half_squared


# @lc code=end
