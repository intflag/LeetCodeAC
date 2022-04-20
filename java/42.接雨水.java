/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 *
 * https://leetcode-cn.com/problems/trapping-rain-water/description/
 *
 * algorithms
 * Hard (60.44%)
 * Likes:    3356
 * Dislikes: 0
 * Total Accepted:    457.9K
 * Total Submissions: 756.5K
 * Testcase Example:  '[0,1,0,2,1,0,1,3,2,1,2,1]'
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 
 * 
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 * 
 * 
 */

// @lc code=start
class Solution {

    //单调栈
    public int trap(int[] height) {
        int trap = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int curr = stack.peek();
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int l = stack.peek();
                int r = i;
                int h = Math.min(height[l], height[r]) - height[curr];
                trap += h * (r - l - 1);
            }
            stack.push(i);
        }
        return trap;
    }

    //双指针
    // public int trap(int[] height) {
    //     int trap = 0;
    //     for (int i = 0; i < height.length; i++) {
    //         if (i == 0 || i == height.length - 1) {
    //             continue;
    //         }
    //         int l = height[i];
    //         int r = height[i];
    //         for (int j = i - 1; j >= 0; j--) {
    //             l = Math.max(l, height[j]);
    //         }
    //         for (int j = i + 1; j < height.length; j++) {
    //             r = Math.max(r, height[j]);
    //         }
    //         trap += Math.max(Math.min(l, r) - height[i], 0);
    //     }
    //     return trap;
    // }
}
// @lc code=end

