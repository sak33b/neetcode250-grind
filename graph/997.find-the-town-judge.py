#
# @lc app=leetcode id=997 lang=python3
#
# [997] Find the Town Judge
#

# @lc code=start
class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        indegree = [0] * (n + 1)
        outdegree = [0] * (n + 1)

        for u, v in trust:
            outdegree[u] += 1
            indegree[v] += 1

        for i in range(1, n + 1):
            if outdegree[i] == 0 and indegree[i] == n - 1:
                return i
        return -1


# @lc code=end
