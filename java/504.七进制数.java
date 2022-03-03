/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 *
 * https://leetcode-cn.com/problems/base-7/description/
 *
 * algorithms
 * Easy (48.30%)
 * Likes:    37
 * Dislikes: 0
 * Total Accepted:    10.6K
 * Total Submissions: 21.8K
 * Testcase Example:  '100'
 *
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 * 
 * 示例 1:
 * 
 * 
 * 输入: 100
 * 输出: "202"
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: -7
 * 输出: "-10"
 * 
 * 
 * 注意: 输入范围是 [-1e7, 1e7] 。
 * 
 */

// @lc code=start
class Solution {

    //Integer API 实现
    // public String convertToBase7(int num) {
    //     return Integer.toString(num, 7);
    // }
    
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int currNum = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (currNum > 0) {
            sb.append(currNum % 7);
            currNum /= 7;
        }
        return num > 0 ? sb.reverse().toString() : "-" + sb.reverse().toString();
    }
}
// @lc code=end

