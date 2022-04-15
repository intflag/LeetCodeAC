/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 *
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/description/
 *
 * algorithms
 * Easy (55.79%)
 * Likes:    716
 * Dislikes: 0
 * Total Accepted:    334.3K
 * Total Submissions: 597.6K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给你两个整数数组 nums1 和 nums2
 * ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * 
 * 
 * 
 * 
 * 进阶：
 * 
 * 
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int idx = 0, idx1 = 0, idx2 = 0;
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] < nums2[idx2]) {
                idx1++;
            } else if (nums1[idx1] > nums2[idx2]){
                idx2++;
            } else {
                res[idx++] = nums1[idx1];
                idx1++;
                idx2++;
            }
        }
        return Arrays.copyOfRange(res, 0, idx);
    }
    // public int[] intersect(int[] nums1, int[] nums2) {
    //     Map<Integer, Integer> map1 = new HashMap<>();
    //     Map<Integer, Integer> map2 = new HashMap<>();
    //     List<Integer> res = new ArrayList<>();
    //     for (int i : nums1) {
    //         map1.put(i, map1.getOrDefault(i, 0) + 1);
    //     }
    //     for (int i : nums2) {
    //         map2.put(i, map2.getOrDefault(i, 0) + 1);
    //     }
    //     for (int k : map1.keySet()) {
    //         if (map2.containsKey(k)) {
    //             int count = Math.min(map1.get(k), map2.get(k));
    //             for (int i = 0; i < count; i++) {
    //                 res.add(k);
    //             }
    //         }
    //     }
    //     return res.stream().mapToInt(i->i).toArray();
    // }
}
// @lc code=end

