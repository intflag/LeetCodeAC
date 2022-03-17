/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 *
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/description/
 *
 * algorithms
 * Medium (49.58%)
 * Likes:    473
 * Dislikes: 0
 * Total Accepted:    213.5K
 * Total Submissions: 429.9K
 * Testcase Example:  '"the sky is blue"'
 *
 * 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
 * 
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * 
 * 请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
 * 
 * 说明：
 * 
 * 
 * 输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
 * 翻转后单词间应当仅用一个空格分隔。
 * 翻转后的字符串中不应包含额外的空格。
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：s = "  hello world  "
 * 输出："world hello"
 * 解释：输入字符串可以在前面或者后面包含多余的空格，但是翻转后的字符不能包括。
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：s = "a good   example"
 * 输出："example good a"
 * 解释：如果两个单词间有多余的空格，将翻转后单词间的空格减少到只含一个。
 * 
 * 
 * 示例 4：
 * 
 * 
 * 输入：s = "  Bob    Loves  Alice   "
 * 输出："Alice Loves Bob"
 * 
 * 
 * 示例 5：
 * 
 * 
 * 输入：s = "Alice does not even like bob"
 * 输出："bob like even not does Alice"
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * s 包含英文大小写字母、数字和空格 ' '
 * s 中 至少存在一个 单词
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 进阶：
 * 
 * 
 * 请尝试使用 O(1) 额外空间复杂度的原地解法。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        s = trimSpace(s);
        char[] arr = s.toCharArray();
        reverse(arr, 0, s.length());
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                reverse(arr, start, i);
                start = i + 1;
            }
            if (i == arr.length - 1) {
                reverse(arr, start, i + 1);
            }
        }
        return new String(arr);
    }

    String trimSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') {
            i++;
        }
        while (i <= j && s.charAt(j) == ' ') {
            j--;
        }
        while (i <= j) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    void reverse(char[] arr, int i, int j) {
        j -= 1;
        while (i < j) {
            char k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
            i++;
            j--;
        }
    }
}
// @lc code=end

