/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 *
 * https://leetcode-cn.com/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (77.37%)
 * Likes:    2394
 * Dislikes: 0
 * Total Accepted:    433.5K
 * Total Submissions: 560.4K
 * Testcase Example:  '3'
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 1
 * 输出：["()"]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= n <= 8
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTracking("", n, n, list);
        return list;
    }

    void backTracking(String currStr, int left, int right,  List<String> list) {
        if (left == 0 && right == 0) {
            list.add(currStr);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            backTracking(currStr + "(", left - 1, right, list);
        }
        if (right > 0) {
            backTracking(currStr + ")", left, right - 1, list);
        }
    }
}
// @lc code=end

