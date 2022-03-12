/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 *
 * https://leetcode-cn.com/problems/permutations/description/
 *
 * algorithms
 * Medium (78.49%)
 * Likes:    1807
 * Dislikes: 0
 * Total Accepted:    529.9K
 * Total Submissions: 675.1K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [1]
 * 输出：[[1]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = Arrays.stream(nums).boxed().collect(Collectors.toList());
        backTracking(current, 0, list);
        return list;
    }

    void backTracking(List<Integer> current, int m, List<List<Integer>> list) {
        if (m == current.size()) {
            list.add(new ArrayList<>(current));
            return;
        }
        for (int i = m; i < current.size(); i++) {
            Collections.swap(current, i, m);
            backTracking(current, m + 1, list);
            Collections.swap(current, i, m);
        }
    }

}
// @lc code=end

