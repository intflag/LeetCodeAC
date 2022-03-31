/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 *
 * https://leetcode-cn.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (49.71%)
 * Likes:    147
 * Dislikes: 0
 * Total Accepted:    29K
 * Total Submissions: 58.2K
 * Testcase Example:  '"0"\n"0"'
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * 
 * 注意：
 * 
 * 
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int len = Math.max(num1.length(), num2.length());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int k = 0;
        while (i < len || k > 0) {
            int x = i < num1.length() ? num1.charAt(i) - '0' : 0;
            int y = i < num2.length() ? num2.charAt(i) - '0' : 0;
            int sum = x + y + k;
            sb.append(sum % 10);
            k = sum / 10;
            i++;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

