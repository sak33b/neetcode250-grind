#
# @lc app=leetcode id=20 lang=python3
#
# [20] Valid Parentheses
#

# @lc code=start

from collections import deque


class Solution:
    def isValid(self, s: str) -> bool:
        stack = deque()

        for char in s:
            if not stack:
                stack.append(char)
                continue

            top = stack[-1]

            if top == "(" and char == ")":
                stack.pop()
            elif top == "[" and char == "]":
                stack.pop()
            elif top == "{" and char == "}":
                stack.pop()
            else:
                stack.append(char)

        return not stack


# @lc code=end
