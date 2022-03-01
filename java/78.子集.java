/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 *
 * https://leetcode-cn.com/problems/subsets/description/
 *
 * algorithms
 * Medium (80.35%)
 * Likes:    1493
 * Dislikes: 0
 * Total Accepted:    379.1K
 * Total Submissions: 471.7K
 * Testcase Example:  '[1,2,3]'
 *
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [0]
 * 输出：[[],[0]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * -10 
 * nums 中的所有元素 互不相同
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        dfs(nums, 0, list, stack);
        return list;
    }

    void dfs(int[] nums, int k, List<List<Integer>> list, Deque<Integer> stack) {
        if (k == nums.length) {
            list.add(new ArrayList<>(stack));
            return;
        }
        dfs(nums, k + 1, list, stack);
        stack.addLast(nums[k]);
        dfs(nums, k + 1, list, stack);
        stack.removeLast();
    }
}
// @lc code=end

