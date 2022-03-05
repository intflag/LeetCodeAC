/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 *
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * algorithms
 * Easy (52.86%)
 * Likes:    259
 * Dislikes: 0
 * Total Accepted:    75.8K
 * Total Submissions: 143.1K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 
 * 说明:
 * 
 * 
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 
 * 
 * 示例:
 * 
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * 
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }
    // public int[] twoSum(int[] numbers, int target) {
    //     if (numbers == null) {
    //         return null;
    //     }
    //     int i = 0;
    //     int j = numbers.length - 1;
    //     while (i < j) {
    //         int sum = numbers[i] + numbers[j];
    //         if (sum > target) {
    //             j--;
    //         } else if (sum < target) {
    //             i++;
    //         } else {
    //             return new int[] {i + 1, j + 1};
    //         }
    //     }
    //     return null;
    // }

    // public int[] twoSum(int[] numbers, int target) {
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = i + 1; j < numbers.length; j++) {
    //             if (numbers[i] + numbers[j] == target) {
    //                 return new int[]{i + 1, j + 1};
    //             }
    //         }
    //     }
    //     return new int[]{0, 0};
    // }
}
// @lc code=end

