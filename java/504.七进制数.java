/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 *
 * https://leetcode.cn/problems/base-7/description/
 *
 * algorithms
 * Easy (52.08%)
 * Likes:    187
 * Dislikes: 0
 * Total Accepted:    77K
 * Total Submissions: 147.9K
 * Testcase Example:  '100'
 *
 * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: num = 100
 * 输出: "202"
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: num = -7
 * 输出: "-10"
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * -10^7 <= num <= 10^7
 * 
 * 
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int res = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (res > 0) {
            sb.append(res % 7);
            res /= 7;
        }
        String s = sb.reverse().toString();
        return num < 0 ? "-" + s : s; 
    }
}
// @lc code=end

