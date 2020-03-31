/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
 *
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/description/
 *
 * algorithms
 * Medium (69.13%)
 * Likes:    174
 * Dislikes: 0
 * Total Accepted:    43.6K
 * Total Submissions: 62.7K
 * Testcase Example:  '[3,1,4,null,2]\n1'
 *
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * 
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 * 
 * 示例 1:
 * 
 * 输入: root = [3,1,4,null,2], k = 1
 * ⁠  3
 * ⁠ / \
 * ⁠1   4
 * ⁠ \
 * 2
 * 输出: 1
 * 
 * 示例 2:
 * 
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 * ⁠      5
 * ⁠     / \
 * ⁠    3   6
 * ⁠   / \
 * ⁠  2   4
 * ⁠ /
 * ⁠1
 * 输出: 3
 * 
 * 进阶：
 * 如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化 kthSmallest 函数？
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    //中序遍历存储中间结果，然后返回集合第k个元素

    // private List<Integer> numList = new ArrayList<>();

    // public int kthSmallest(TreeNode root, int k) {
    //     if (root == null) return 0;
    //     dfs(root.left);
    //     if (root != null) numList.add(root.val);
    //     dfs(root.right);
    //     return numList.get(k-1);
    // }

    // public void dfs(TreeNode root) {
    //     if (root == null) return;
    //     dfs(root.left);
    //     if (root != null) numList.add(root.val);
    //     dfs(root.right);
    // }

    //中序遍历不存储结果，遇到第k个直接返回

    private int val = 0;
    private int cnt = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return val;
    }

    public void inOrder(TreeNode root, int k) {
        if (root == null) return;
        inOrder(root.left, k);
        cnt++;
        if (cnt == k) {
            val = root.val;
            return;
        }
        inOrder(root.right, k);
    }
}
// @lc code=end

