#
# @lc app=leetcode id=200 lang=python3
#
# [200] Number of Islands
#

# @lc code=start


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        island = 0

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    self.dfs(grid, i, j)
                    island += 1

        return island

    def dfs(self, grid, i, j):
        row = len(grid)
        col = len(grid[0])

        if not (0 <= i < row and 0 <= j < col):
            return

        if grid[i][j] == "1":
            grid[i][j] = "-1"

            self.dfs(grid, i + 1, j)
            self.dfs(grid, i - 1, j)
            self.dfs(grid, i, j + 1)
            self.dfs(grid, i, j - 1)


# @lc code=end
