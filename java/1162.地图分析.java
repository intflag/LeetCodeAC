/*
 * @lc app=leetcode.cn id=1162 lang=java
 *
 * [1162] 地图分析
 *
 * https://leetcode-cn.com/problems/as-far-from-land-as-possible/description/
 *
 * algorithms
 * Medium (47.29%)
 * Likes:    254
 * Dislikes: 0
 * Total Accepted:    42.1K
 * Total Submissions: 89.2K
 * Testcase Example:  '[[1,0,1],[0,0,0],[1,0,1]]'
 *
 * 你现在手里有一份大小为 n x n 的 网格 grid，上面的每个 单元格 都用 0 和 1 标记好了。其中 0 代表海洋，1 代表陆地。
 * 
 * 请你找出一个海洋单元格，这个海洋单元格到离它最近的陆地单元格的距离是最大的，并返回该距离。如果网格上只有陆地或者海洋，请返回 -1。
 * 
 * 我们这里说的距离是「曼哈顿距离」（ Manhattan Distance）：(x0, y0) 和 (x1, y1) 这两个单元格之间的距离是 |x0 -
 * x1| + |y0 - y1| 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 
 * 
 * 输入：grid = [[1,0,1],[0,0,0],[1,0,1]]
 * 输出：2
 * 解释： 
 * 海洋单元格 (1, 1) 和所有陆地单元格之间的距离都达到最大，最大距离为 2。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 
 * 
 * 输入：grid = [[1,0,0],[0,0,0],[0,0,0]]
 * 输出：4
 * 解释： 
 * 海洋单元格 (2, 2) 和所有陆地单元格之间的距离都达到最大，最大距离为 4。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 
 * 
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 100
 * grid[i][j] 不是 0 就是 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        if (queue.isEmpty() || queue.size() == grid.length * grid[0].length) {
            return -1;
        }
        int distance = 0;
        int[][] moves = new int[][]{
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        while (!queue.isEmpty()) {
            int n = queue.size();
            distance++;
            while (n-- > 0) {
                int[] node = queue.poll();
                int i = node[0];
                int j = node[1];
                for (int[] move : moves) {
                    int row = i + move[0];
                    int col = j + move[1];
                    if (inArea(grid, row, col) && grid[row][col] == 0) {
                        grid[row][col] = 2;
                        queue.offer(new int[]{row,  col});
                    }
                }
            }
        }
        return distance - 1;
    }

    boolean inArea(int[][] grid, int i, int j) {
        return 0 <= i && i < grid.length && 0 <= j && j < grid[0].length;
    }
}
// @lc code=end

