#
# @lc app=leetcode id=463 lang=python3
#
# [463] Island Perimeter
#

# @lc code=start
class Solution:
    def count_perimeter(self, grid, r, c):
        row = len(grid)
        col = len(grid[0])
        perimeter = 0

        dr = [-1, 1, 0, 0]
        dc = [0, 0, -1, 1]

        for i in range(4):
            rr = r + dr[i]
            cc = c + dc[i]

            if not (0 <= rr < row and 0 <= cc < col):
                perimeter += 1
                continue

            if grid[rr][cc] == 0:
                perimeter += 1

        return perimeter

    def islandPerimeter(self, grid: List[List[int]]) -> int:
        perimeter = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    perimeter += self.count_perimeter(grid, i, j)
        return perimeter


# @lc code=end
