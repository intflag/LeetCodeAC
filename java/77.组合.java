/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 *
 * https://leetcode-cn.com/problems/combinations/description/
 *
 * algorithms
 * Medium (76.95%)
 * Likes:    883
 * Dislikes: 0
 * Total Accepted:    290.3K
 * Total Submissions: 377.1K
 * Testcase Example:  '4\n2'
 *
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * 
 * 你可以按 任何顺序 返回答案。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 4, k = 2
 * 输出：
 * [
 * ⁠ [2,4],
 * ⁠ [3,4],
 * ⁠ [2,3],
 * ⁠ [1,2],
 * ⁠ [1,3],
 * ⁠ [1,4],
 * ]
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 1 
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        backTracking(n, 1, k, list, deque);
        return list;
    }

    void backTracking(int n, int m, int k, List<List<Integer>> list, Deque<Integer> deque) {
        if (k == deque.size()) {
            list.add(new ArrayList<>(deque));
            return;
        }
        for (int i = m; i <= n; i++) {
            deque.addLast(i);
            backTracking(n, i + 1, k, list, deque);
            deque.removeLast();
        }
    }
}
// @lc code=end

