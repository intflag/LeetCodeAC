/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 *
 * https://leetcode-cn.com/problems/rotate-array/description/
 *
 * algorithms
 * Medium (44.52%)
 * Likes:    1360
 * Dislikes: 0
 * Total Accepted:    442K
 * Total Submissions: 993.7K
 * Testcase Example:  '[1,2,3,4,5,6,7]\n3'
 *
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释: 
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 * 
 * 
 * 
 * 
 * 进阶：
 * 
 * 
 * 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }

    void reverse(int[] nums, int i, int j) {
        j -= 1;
        while (i < j) {
            int k = nums[i];
            nums[i] = nums[j];
            nums[j] = k;
            i++;
            j--;
        }
    }

}
// @lc code=end

