/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 *
 * https://leetcode-cn.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (48.55%)
 * Likes:    1049
 * Dislikes: 0
 * Total Accepted:    247.2K
 * Total Submissions: 508.5K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * m == matrix.length
 * n == matrix[i].length
 * 1 
 * -100 
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int num = matrix.length * matrix[0].length;
        while (num > 0) {
            for (int i = left; i <= right && num-- > 0; i++) {
                list.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down && num-- > 0; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && num-- > 0; i--) {
                list.add(matrix[down][i]);
            }
            down--;
            for (int i = down; i >= up && num-- > 0; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list; 
    }
}
// @lc code=end

