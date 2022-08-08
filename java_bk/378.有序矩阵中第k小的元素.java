/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第K小的元素
 *
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
 *
 * algorithms
 * Medium (58.38%)
 * Likes:    186
 * Dislikes: 0
 * Total Accepted:    18K
 * Total Submissions: 30.6K
 * Testcase Example:  '[[1,5,9],[10,11,13],[12,13,15]]\n8'
 *
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 * 
 * 
 * 
 * 示例:
 * 
 * matrix = [
 * ⁠  [ 1,  5,  9],
 * ⁠  [10, 11, 13],
 * ⁠  [12, 13, 15]
 * ],
 * k = 8,
 * 
 * 返回 13。
 * 
 * 
 * 
 * 
 * 提示：
 * 你可以假设 k 的值永远是有效的, 1 ≤ k ≤ n^2 。
 * 
 */

// @lc code=start
class Solution {
    
    //暴力
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] arr = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[index++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }

    //优先队列
    // public int kthSmallest(int[][] matrix, int k) {
    //     int n = matrix.length;
    //     PriorityQueue<Integer> queue = new PriorityQueue<>((x,y)-> x > y? -1 : 1);
    //     for (int i = 0; i < n + n - 1; i++) {
    //         for (int j = 0; j < i + 1; j++) {
    //             int x = i - j;
    //             if (x < n && x >= 0 && j < n) {
    //                 queue.add(matrix[j][x]);
    //                 if (queue.size() > k) {
    //                     queue.poll();
    //                 }
    //             }
    //         }
    //     }
    //     return queue.peek();
    // }
}
// @lc code=end

