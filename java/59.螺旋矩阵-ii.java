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
        for (int i = 1; i <= n * n;) {
            for (int j = left; j <= right && num-- > 0; j++) {
                matrix[up][j] = i++;
            }
            up++;
            for (int j = up; j <= down && num-- > 0; j++) {
                matrix[j][right] = i++;
            }
            right--;
            for (int j = right; j >= left && num-- > 0; j--) {
                matrix[down][j] = i++;
            }
            down--;
            for (int j = down; j >= up && num-- > 0; j--) {
                matrix[j][left] = i++;
            }
            left++;
        }
        return matrix;
    }
}
// @lc code=end

