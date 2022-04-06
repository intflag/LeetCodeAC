/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 *
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/description/
 *
 * algorithms
 * Medium (61.49%)
 * Likes:    405
 * Dislikes: 0
 * Total Accepted:    94.1K
 * Total Submissions: 152.5K
 * Testcase Example:  '[3,2,1,5,6,4]\n2'
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 
 * 示例 1:
 * 
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 
 * 
 * 示例 2:
 * 
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 
 * 说明: 
 * 
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * 
 */

// @lc code=start
class Solution {

    //排序法
    // public int findKthLargest(int[] nums, int k) {
    //     Arrays.sort(nums);
    //     return nums[nums.length - k];
    // }

    public int findKthLargest(int[] nums, int k) {
        // bubbleSort(nums);
        // insertSort(nums);
        // selectSort(nums);
        quickSort(nums, 0, nums.length - 1);
        return nums[k - 1];
    } 

    void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = partition(nums, left, right);
        quickSort(nums, left, mid - 1);
        quickSort(nums, mid + 1, right);
    }

    int partition(int[] nums, int left, int right) {
        int mid = left;
        int flag = nums[right];
        for (int i = left; i < right; i++) {
            if (nums[i] > flag) {
                swap(nums, i, mid);
                mid++;
            }
        }
        swap(nums, mid, right);
        return mid;
    }

    void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    void insertSort(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            int val = nums[i];
            int j = i - 1;
            while (j >= 0) {
                if (nums[j] < val) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
                j--;
            }
            nums[j + 1] = val;
        }
    }

    void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
// @lc code=end

