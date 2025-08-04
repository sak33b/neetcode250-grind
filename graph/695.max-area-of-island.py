#
# @lc app=leetcode id=695 lang=python3
#
# [695] Max Area of Island
#

# @lc code=start
class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        max_area = 0

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    max_area = max(max_area, self.dfs_and_get_area(grid, i, j))

        return max_area

    def dfs_and_get_area(self, grid, i, j):
        if not (0 <= i < len(grid) and 0 <= j < len(grid[0])):
            return 0

        if grid[i][j] == 0 or grid[i][j] == -1:
            return 0

        grid[i][j] = -1
        area = 1

        area += self.dfs_and_get_area(grid, i + 1, j)
        area += self.dfs_and_get_area(grid, i - 1, j)
        area += self.dfs_and_get_area(grid, i, j + 1)
        area += self.dfs_and_get_area(grid, i, j - 1)

        return area


# @lc code=end
