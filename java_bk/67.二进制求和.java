/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode-cn.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (52.21%)
 * Likes:    340
 * Dislikes: 0
 * Total Accepted:    74.7K
 * Total Submissions: 142.7K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 
 * 示例 2:
 * 
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 * 
 * 
 */

// @lc code=start
class Solution {
    // public String addBinary(String a, String b) {
    //     int rema = 0;
    //     int len = Math.max(a.length(), b.length());
    //     StringBuilder sb = new StringBuilder();
    //     a = new StringBuilder(a).reverse().toString();
    //     b = new StringBuilder(b).reverse().toString();
    //     for (int i = 0; i < len; i++) {
    //         int x = i < a.length() ? a.charAt(i) - '0' : 0;
    //         int y = i < b.length() ? b.charAt(i) - '0' : 0;
    //         int sum = x + y + rema;
    //         sb.append(sum % 2);
    //         rema = sum / 2;
    //     }
    //     if (rema == 1) {
    //         sb.append(1);
    //     }
    //     return sb.reverse().toString();
    // }

    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder str = new StringBuilder();
        while (carry == 1 || i >= 0 || j >= 0) {
            if (i >= 0 && a.charAt(i--) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1') {
                carry++;
            }
            str.append(carry % 2);
            carry /= 2;
        }
        return str.reverse().toString();
    }
}
// @lc code=end

