/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 *
 * https://leetcode.cn/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (77.50%)
 * Likes:    2795
 * Dislikes: 0
 * Total Accepted:    561.8K
 * Total Submissions: 724.9K
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
        StringBuilder sb = new StringBuilder();
        backTracking(n, n, list, sb);
        return list;
    }

    void backTracking(int left, int right, List<String> list, StringBuilder sb) {
        if (left < 0 || right < 0) {
            return;
        }
        if (right < left) {
            return;
        }
        if (left == 0 && right == 0) {
            list.add(sb.toString());
            return;
        }

        sb.append('(');
        backTracking(left - 1, right, list, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        backTracking(left, right - 1, list, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
// @lc code=end

