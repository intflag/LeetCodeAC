/*
 * @lc app=leetcode.cn id=524 lang=java
 *
 * [524] 通过删除字母匹配到字典里最长单词
 *
 * https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/description/
 *
 * algorithms
 * Medium (45.26%)
 * Likes:    51
 * Dislikes: 0
 * Total Accepted:    8.9K
 * Total Submissions: 19.6K
 * Testcase Example:  '"abpcplea"\n["ale","apple","monkey","plea"]'
 *
 * 
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 * 
 * 示例 1:
 * 
 * 
 * 输入:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * 
 * 输出: 
 * "apple"
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入:
 * s = "abpcplea", d = ["a","b","c"]
 * 
 * 输出: 
 * "a"
 * 
 * 
 * 说明:
 * 
 * 
 * 所有输入的字符串只包含小写字母。
 * 字典的大小不会超过 1000。
 * 所有输入的字符串长度不会超过 1000。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res = "";
        for (String ds : d) {
            if (isSubstr(s, ds)) {
                res = getLenStr(res, ds);
            }
        }
        return res;
    }

    public boolean isSubstr(String s, String target) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public String getLenStr(String s, String target) {
        if (target.length() > s.length()) {
            return target;
        } else if (target.length() < s.length()) {
            return s;
        } else {
            return s.compareTo(target) >= 0 ? target : s;
        }
    }
}
// @lc code=end

