/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 *
 * https://leetcode-cn.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (52.20%)
 * Likes:    108
 * Dislikes: 0
 * Total Accepted:    17.8K
 * Total Submissions: 33.9K
 * Testcase Example:  '"abccccdd"'
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * 
 * 示例 1: 
 * 
 * 
 * 输入:
 * "abccccdd"
 * 
 * 输出:
 * 7
 * 
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for (char ch : s.toCharArray()) {
            map[ch] ++;
        } 
        int sum = 0;
        for (int k : map) {
            sum += (k / 2) * 2;
        }
        return sum < s.length() ? ++sum : sum;
    }
    // public int longestPalindrome(String s) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     for (char ch : s.toCharArray()) {
    //         map.put(ch, map.getOrDefault(ch, 0) + 1);
    //     } 
    //     int sum = 0;
    //     for (Character key : map.keySet()) {
    //         int k = map.get(key);
    //         sum += (k / 2) * 2;
    //     }
    //     return sum < s.length() ? ++sum : sum;
    // }
}
// @lc code=end

