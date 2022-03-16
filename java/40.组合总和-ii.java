/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 *
 * https://leetcode-cn.com/problems/combination-sum-ii/description/
 *
 * algorithms
 * Medium (61.30%)
 * Likes:    864
 * Dislikes: 0
 * Total Accepted:    251.1K
 * Total Submissions: 410.5K
 * Testcase Example:  '[10,1,2,7,6,1,5]\n8'
 *
 * 给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * 
 * candidates 中的每个数字在每个组合中只能使用 一次 。
 * 
 * 注意：解集不能包含重复的组合。 
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 输出:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * 
 * 示例 2:
 * 
 * 
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 输出:
 * [
 * [1,2,2],
 * [5]
 * ]
 * 
 * 
 * 
 * 提示:
 * 
 * 
 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(candidates);
        backTracking(candidates, 0, target, list, deque);
        return list;
    }

    void backTracking(int[] candidates, int m, int target, List<List<Integer>> list, Deque<Integer> deque) {
        if (target == 0) {
            list.add(new ArrayList<>(deque));
            return;
        }
        for (int i = m; i < candidates.length; i++) {
            if (m <i && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int currSum = target - candidates[i];
            if (currSum < 0) {
                break;
            }
            deque.addLast(candidates[i]);
            backTracking(candidates, i + 1, currSum, list, deque);
            deque.removeLast();
        }
    }
}
// @lc code=end

