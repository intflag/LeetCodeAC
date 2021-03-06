/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 *
 * https://leetcode-cn.com/problems/top-k-frequent-elements/description/
 *
 * algorithms
 * Medium (60.62%)
 * Likes:    276
 * Dislikes: 0
 * Total Accepted:    43.1K
 * Total Submissions: 71.1K
 * Testcase Example:  '[1,1,1,2,2,3]\n2'
 *
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 
 * 示例 1:
 * 
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 
 * 
 * 示例 2:
 * 
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 
 * 说明：
 * 
 * 
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //首先统计数字出现的次数，key为该数字，val为该数字出现的次数
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i : nums) {
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        //构建桶，桶的下标表示次数，每一个桶内存出现了该次的那个数字
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        numMap.forEach((key, val) -> {
            if (buckets[val] == null) {
                buckets[val] = new ArrayList<>();
            }
            buckets[val].add(key);
        });
        //从后往前遍历桶，取出出现频率最大的数字
        List<Integer> topK = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && topK.size() < k; i--) {
            if (buckets[i] == null) {
                continue;
            }
            if (buckets[i].size() <= k - topK.size()) {
                topK.addAll(buckets[i]);
            } else {
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }
        return topK;
    }
}
// @lc code=end

