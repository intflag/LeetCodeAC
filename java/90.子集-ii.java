/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 *
 * https://leetcode-cn.com/problems/subsets-ii/description/
 *
 * algorithms
 * Medium (63.39%)
 * Likes:    752
 * Dislikes: 0
 * Total Accepted:    171.7K
 * Total Submissions: 270.8K
 * Testcase Example:  '[1,2,2]'
 *
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * 
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
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
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        backTracking(nums, 0, list, deque);
        return list;
    }

    void backTracking(int[] nums, int k, List<List<Integer>> list, Deque<Integer> deque) {
        if (k == nums.length) {
            list.add(new ArrayList<>(deque));
            return;
        }
        deque.addLast(nums[k]);
        backTracking(nums, k + 1, list, deque);
        deque.removeLast();
        
        int j = k;
        while (j < nums.length && nums[j] == nums[k]) {
            j++;
        }
        backTracking(nums, j, list, deque);
    }
}
// @lc code=end

