/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 *
 * https://leetcode-cn.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (51.73%)
 * Likes:    225
 * Dislikes: 0
 * Total Accepted:    117.2K
 * Total Submissions: 226.5K
 * Testcase Example:  '[1,2,3,1]'
 *
 * 给定一个整数数组，判断是否存在重复元素。
 * 
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,1]
 * 输出: true
 * 
 * 示例 2:
 * 
 * 输入: [1,2,3,4]
 * 输出: false
 * 
 * 示例 3:
 * 
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * 
 */

// @lc code=start
class Solution {
    // public boolean containsDuplicate(int[] nums) {
    //     Map<Integer,Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (map.containsKey(nums[i])) {
    //             return  true;
    //         }
    //         map.put(nums[i],0);
    //     }
    //     return false;
    // }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() < i+1) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

