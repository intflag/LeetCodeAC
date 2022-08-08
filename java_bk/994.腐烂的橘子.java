/*
 * @lc app=leetcode.cn id=994 lang=java
 *
 * [994] 腐烂的橘子
 *
 * https://leetcode-cn.com/problems/rotting-oranges/description/
 *
 * algorithms
 * Medium (51.22%)
 * Likes:    517
 * Dislikes: 0
 * Total Accepted:    72.1K
 * Total Submissions: 141K
 * Testcase Example:  '[[2,1,1],[1,1,0],[0,1,1]]'
 *
 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
 * 
 * 
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 
 * 
 * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
 * 
 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 
 * 
 * 输入：grid = [[2,1,1],[1,1,0],[0,1,1]]
 * 输出：4
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：grid = [[2,1,1],[0,1,1],[1,0,1]]
 * 输出：-1
 * 解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：grid = [[0,2]]
 * 输出：0
 * 解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 10
 * grid[i][j] 仅为 0、1 或 2
 * 
 * 
 */

// @lc code=start
class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<int[]> queue = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        int min = 0;
        int[][] moves = new int[][]{
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        while (count > 0 && !queue.isEmpty()) {
            min++;
            int n = queue.size();
            while (n-- > 0) {
                int[] node = queue.poll();
                int i = node[0];
                int j = node[1];
                for (int[] move : moves) {
                    int r = i + move[0];
                    int c = j + move[1];
                    if (inArea(grid, r, c) && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        count--;
                        queue.offer(new int[]{r, c});
                    }
                }
            }
        }
        if (count > 0) {
            return -1;
        }
        return min;
    }

    boolean inArea(int[][] grid, int i, int j) {
        return 0 <= i && i < grid.length && 0 <= j && j < grid[0].length;
    }
}
// @lc code=end

