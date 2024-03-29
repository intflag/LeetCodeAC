/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 *
 * https://leetcode-cn.com/problems/spiral-matrix-ii/description/
 *
 * algorithms
 * Medium (76.80%)
 * Likes:    665
 * Dislikes: 0
 * Total Accepted:    182.5K
 * Total Submissions: 238.2K
 * Testcase Example:  '3'
 *
 * 给你一个正整数 n ，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 1
 * 输出：[[1]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int num = n * n;
        int idx = 1;
        while (num > 0) {
            for (int i = left; i <= right && num-- > 0; i++) {
                matrix[up][i] = idx++;
            }
            up++;
            for (int i = up; i <= down && num-- > 0; i++) {
                matrix[i][right] = idx++;
            }
            right--;
            for (int i = right; i >= left && num-- > 0; i--) {
                matrix[down][i] = idx++;
            }
            down--;
            for (int i = down; i >= up && num-- > 0; i--) {
                matrix[i][left] = idx++;
            }
            left++;
        }
        return matrix;
    }
}
// @lc code=end

