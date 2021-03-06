/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 *
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/description/
 *
 * algorithms
 * Easy (45.79%)
 * Likes:    77
 * Dislikes: 0
 * Total Accepted:    8.6K
 * Total Submissions: 18.8K
 * Testcase Example:  '[1,3,2,2,5,2,3,7]'
 *
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 * 
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [1,3,2,2,5,2,3,7]
 * 输出: 5
 * 原因: 最长的和谐数组是：[3,2,2,2,3].
 * 
 * 
 * 说明: 输入的数组长度最大不超过20,000.
 * 
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i : nums) {
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        int len = 0;
        for (Integer key : numMap.keySet()) {
            if (numMap.containsKey(key + 1)) {
                int sum = numMap.get(key) + numMap.get(key + 1);
                len = Math.max(len,sum);
            }
        }
        return len;
    }
}
// @lc code=end

