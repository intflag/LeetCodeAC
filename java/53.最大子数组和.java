/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 *
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (55.17%)
 * Likes:    4391
 * Dislikes: 0
 * Total Accepted:    863.3K
 * Total Submissions: 1.6M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 子数组 是数组中的一个连续部分。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [1]
 * 输出：1
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * 
 * 
 * 
 * 
 * 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
 * 
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        //子问题：f(k) = nums[0...k) 中以 nums[k-1] 结尾的最大子数组和
        //原问题：max{f(k)}, 0 <= k <= n
        //f(0) = 0
        //f(k) = max{f(k - 1)+nums[k - 1], f(k - 1)}
        int n = nums.length;
        int[] dp = new int[n + 1];
        int max = nums[0];
        for (int i = 1; i <=n; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i - 1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
// @lc code=end

