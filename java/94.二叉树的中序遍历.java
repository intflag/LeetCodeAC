/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (70.50%)
 * Likes:    438
 * Dislikes: 0
 * Total Accepted:    129K
 * Total Submissions: 182.4K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的中序 遍历。
 * 
 * 示例:
 * 
 * 输入: [1,null,2,3]
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3
 * 
 * 输出: [1,3,2]
 * 
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
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

    //递归方式
    List<Integer> numList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return numList;
        dfs(root.left);
        visit(root);
        dfs(root.right);
        return numList;
    }

    public void visit(TreeNode root) {
        if (root != null) numList.add(root.val);
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        visit(root);
        dfs(root.right);
    } 
}
// @lc code=end

