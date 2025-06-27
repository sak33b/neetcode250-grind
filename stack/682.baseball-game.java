/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String operation : operations) {
            if (operation.equals("C")) {
                sum -= stack.pop();
                continue;
            } else if (operation.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (operation.equals("+")) {
                Integer last = stack.pop();
                Integer secondLast = stack.peek();
                stack.push(last);
                stack.push(last + secondLast);
            } else {
                stack.push(Integer.parseInt(operation));
            }
            sum += stack.peek();
        }
        return sum;
    }
}
// @lc code=end

