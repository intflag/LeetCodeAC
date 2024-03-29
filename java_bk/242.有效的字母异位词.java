/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 *
 * https://leetcode-cn.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (58.82%)
 * Likes:    167
 * Dislikes: 0
 * Total Accepted:    82.3K
 * Total Submissions: 139.7K
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 
 * 示例 1:
 * 
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * 
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     int[] num = new int[26];
    //     for (int i = 0; i < s.length(); i++) {
    //         num[s.charAt(i) - 'a']++;
    //         num[t.charAt(i) - 'a']--;
    //     }
    //     for (int i : num) {
    //         if (i != 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public boolean isAnagram(String s, String t) {
    //     Map<Character,Integer> numMap = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         Character ch = s.charAt(i);
    //         numMap.put(ch, numMap.getOrDefault(ch, 0) + 1);
    //     }
    //     for (int i = 0; i < t.length(); i++) {
    //         Character ch = t.charAt(i);
    //         numMap.put(ch, numMap.getOrDefault(ch, 0) - 1);
    //     }
    //     for (Character key : numMap.keySet()) {
    //         if (!numMap.get(key).equals(0)) {
    //             return false;
    //         }
    //     }
    //     return  true;
    // }
}
// @lc code=end

