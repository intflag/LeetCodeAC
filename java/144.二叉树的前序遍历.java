/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
 *
 * algorithms
 * Medium (64.49%)
 * Likes:    229
 * Dislikes: 0
 * Total Accepted:    83.9K
 * Total Submissions: 129.5K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的 前序 遍历。
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
 * 输出: [1,2,3]
 * 
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
    // List<Integer> numList = new ArrayList<>();

    // public List<Integer> preorderTraversal(TreeNode root) {
    //     if (root == null) return numList;
    //     visit(root);
    //     dfs(root.left);
    //     dfs(root.right);
    //     return numList;
    // }

    // public void visit(TreeNode root) {
    //     if (root != null) numList.add(root.val);
    // }

    // public void dfs(TreeNode root) {
    //     if (root == null) return;
    //     visit(root);
    //     dfs(root.left);
    //     dfs(root.right);
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //preOrder(root, list);
        //preOrderUseStack(root, list);
        preOrderUseMorris(root, list);
        return list;
    }

    void preOrderUseMorris(TreeNode root, List<Integer> list) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode next = curr.left;
                while (next.right != null && next.right != curr) {
                    next = next.right;
                }
                if (next.right == null) {
                    list.add(curr.val);
                    next.right = curr;
                    curr = curr.left;
                } else {
                    next.right = null;
                    curr = curr.right;
                }
            }
        }
    }

    void preOrderUseStack(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
// @lc code=end

