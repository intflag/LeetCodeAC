/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 *
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (46.95%)
 * Likes:    447
 * Dislikes: 0
 * Total Accepted:    124.4K
 * Total Submissions: 264.3K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。
 * 
 * 
 * 
 * 说明:
 * 
 * 
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 
 * 
 * 
 * 
 * 示例:
 * 
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                nums1[len--] = nums2[j--];
            } else if (j < 0) {
                nums1[len--] = nums1[i--];
            } else if (nums1[i] < nums2[j]) {
                nums1[len--] = nums2[j--];
            } else {
                nums1[len--] = nums1[i--];
            }
        }
    }
}
// @lc code=end

