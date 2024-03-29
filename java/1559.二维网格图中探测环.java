/*
 * @lc app=leetcode.cn id=1559 lang=java
 *
 * [1559] 二维网格图中探测环
 *
 * https://leetcode.cn/problems/detect-cycles-in-2d-grid/description/
 *
 * algorithms
 * Medium (38.91%)
 * Likes:    48
 * Dislikes: 0
 * Total Accepted:    5.7K
 * Total Submissions: 14.7K
 * Testcase Example:  '[["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]'
 *
 * 给你一个二维字符网格数组 grid ，大小为 m x n ，你需要检查 grid 中是否存在 相同值 形成的环。
 * 
 * 一个环是一条开始和结束于同一个格子的长度 大于等于 4
 * 的路径。对于一个给定的格子，你可以移动到它上、下、左、右四个方向相邻的格子之一，可以移动的前提是这两个格子有 相同的值 。
 * 
 * 同时，你也不能回到上一次移动时所在的格子。比方说，环  (1, 1) -> (1, 2) -> (1, 1) 是不合法的，因为从 (1, 2) 移动到
 * (1, 1) 回到了上一次移动时的格子。
 * 
 * 如果 grid 中有相同值形成的环，请你返回 true ，否则返回 false 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 
 * 输入：grid =
 * [["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]
 * 输出：true
 * 解释：如下图所示，有 2 个用不同颜色标出来的环：
 * 
 * 
 * 
 * 示例 2：
 * 
 * 
 * 
 * 输入：grid =
 * [["c","c","c","a"],["c","d","c","c"],["c","c","e","c"],["f","c","c","c"]]
 * 输出：true
 * 解释：如下图所示，只有高亮所示的一个合法环：
 * 
 * 
 * 
 * 示例 3：
 * 
 * 
 * 
 * 输入：grid = [["a","b","b"],["b","z","b"],["b","b","a"]]
 * 输出：false
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * m == grid.length
 * n == grid[i].length
 * 1 <= m <= 500
 * 1 <= n <= 500
 * grid 只包含小写英文字母。
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean containsCycle(char[][] grid) {

    }
}
// @lc code=end

