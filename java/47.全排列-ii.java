/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 *
 * https://leetcode-cn.com/problems/permutations-ii/description/
 *
 * algorithms
 * Medium (64.28%)
 * Likes:    961
 * Dislikes: 0
 * Total Accepted:    271.9K
 * Total Submissions: 422.6K
 * Testcase Example:  '[1,1,2]'
 *
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 * ⁠[1,2,1],
 * ⁠[2,1,1]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 8
 * -10 <= nums[i] <= 10
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = Arrays.stream(nums).boxed().collect(Collectors.toList());
        backTracking(current, 0, list);
        return list;
    }

    void backTracking(List<Integer> current, int k, List<List<Integer>> list){
        if (k == current.size()) {
            list.add(new ArrayList<>(current));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = k; i < current.size(); i++) {
            if (set.contains(current.get(i))) {
                continue;
            }
            set.add(current.get(i));
            Collections.swap(current, i, k);
            backTracking(current, k + 1, list);
            Collections.swap(current, i, k);
        }
    }

}
// @lc code=end

