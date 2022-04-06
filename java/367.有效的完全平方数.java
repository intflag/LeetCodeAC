/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 *
 * https://leetcode-cn.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (44.85%)
 * Likes:    357
 * Dislikes: 0
 * Total Accepted:    137.1K
 * Total Submissions: 305.8K
 * Testcase Example:  '16'
 *
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * 
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：num = 16
 * 输出：true
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：num = 14
 * 输出：false
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 0;
        int j = num;
        while (i <= j) {
            int m = i + ((j - i) >> 1);
            if ((long) m * m < num) {
                i = m + 1;
            } else if ((long) m * m > num) {
                j = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

