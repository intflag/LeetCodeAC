/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 *
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/description/
 *
 * algorithms
 * Easy (72.63%)
 * Likes:    360
 * Dislikes: 0
 * Total Accepted:    143K
 * Total Submissions: 196.9K
 * Testcase Example:  '"abbaca"'
 *
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串
 * "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int fast = 0;
        int slow = 0;
        while (fast < arr.length) {
            arr[slow] = arr[fast];
            if (slow > 0 && arr[slow] == arr[slow - 1]) {
                slow--;
            } else {
                slow++;
            }
            fast++;
        }
        return new String(arr, 0, slow);
    }
    // public String removeDuplicates(String s) {
    //     StringBuilder sb = new StringBuilder();
    //     for (char ch : s.toCharArray()) {
    //         if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {
    //             sb.append(ch);
    //         } else {
    //             sb.deleteCharAt(sb.length() - 1);
    //         }
    //     }
    //     return sb.toString();
    // }
}
// @lc code=end

