import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 *
 * https://leetcode-cn.com/problems/binary-tree-paths/description/
 *
 * algorithms
 * Easy (69.03%)
 * Likes:    653
 * Dislikes: 0
 * Total Accepted:    174K
 * Total Submissions: 252K
 * Testcase Example:  '[1,2,3,null,5]'
 *
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * 
 * 叶子节点 是指没有子节点的节点。
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：root = [1,2,3,null,5]
 * 输出：["1->2->5","1->3"]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：root = [1]
 * 输出：["1"]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 树中节点的数目在范围 [1, 100] 内
 * -100 <= Node.val <= 100
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        return list;
    }

    void dfs(TreeNode root, String currStr, List<String> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(currStr + root.val);
            return;
        }
        currStr = currStr + root.val + "->";
        dfs(root.left, currStr, list);
        dfs(root.right, currStr, list);
    }
}
// @lc code=end

