/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 *
 * https://leetcode-cn.com/problems/largest-rectangle-in-histogram/description/
 *
 * algorithms
 * Hard (44.03%)
 * Likes:    1883
 * Dislikes: 0
 * Total Accepted:    238.4K
 * Total Submissions: 541.2K
 * Testcase Example:  '[2,1,5,6,2,3]'
 *
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * 
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 
 * 
 * 输入：heights = [2,1,5,6,2,3]
 * 输出：10
 * 解释：最大的矩形为图中红色区域，面积为 10
 * 
 * 
 * 示例 2：
 * 
 * 
 * 
 * 
 * 输入： heights = [2,4]
 * 输出： 4
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 0 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int[] arr = new int[heights.length + 2];
        System.arraycopy(heights, 0, arr, 1, heights.length);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int curr = stack.pop();
                int l = stack.peek();
                int r = i;
                int currArea = arr[curr] * (r - l - 1);
                area = Math.max(area, currArea);
            }
            stack.push(i);
        }
        return area;
    }
}
// @lc code=end

