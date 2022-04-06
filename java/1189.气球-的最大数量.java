/*
 * @lc app=leetcode.cn id=1189 lang=java
 *
 * [1189] “气球” 的最大数量
 *
 * https://leetcode-cn.com/problems/maximum-number-of-balloons/description/
 *
 * algorithms
 * Easy (68.83%)
 * Likes:    109
 * Dislikes: 0
 * Total Accepted:    51.7K
 * Total Submissions: 75.1K
 * Testcase Example:  '"nlaebolko"'
 *
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * 
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 
 * 输入：text = "nlaebolko"
 * 输出：1
 * 
 * 
 * 示例 2：
 * 
 * 
 * 
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 
 * 
 * 示例 3：
 * 
 * 输入：text = "leetcode"
 * 输出：0
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= text.length <= 10^4
 * text 全部由小写英文字母组成
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[5];
        for (char c : text.toCharArray()) {
            if (c == 'b') {
                map[0]++;
            }
            if (c == 'a') {
                map[1]++;
            }
            if (c == 'l') {
                map[2]++;
            }
            if (c == 'o') {
                map[3]++;
            }
            if (c == 'n') {
                map[4]++;
            }
        }
        int max = map[0];
        map[2] /= 2;
        map[3] /= 2;
        for (int i : map) {
            max = Math.min(max, i);
        }
        return max;
    }
}
// @lc code=end

