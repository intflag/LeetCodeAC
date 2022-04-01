/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/description/
 *
 * algorithms
 * Hard (70.55%)
 * Likes:    257
 * Dislikes: 0
 * Total Accepted:    62.4K
 * Total Submissions: 88.2K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的 后序 遍历。
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
 * 输出: [3,2,1]
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

    // public List<Integer> postorderTraversal(TreeNode root) {
    //     if (root == null) return numList;
    //     dfs(root.left);
    //     dfs(root.right);
    //     visit(root);
    //     return numList;
    // }

    // public void visit(TreeNode root) {
    //     if (root != null) numList.add(root.val);
    // }

    // public void dfs(TreeNode root) {
    //     if (root == null) return;
    //     dfs(root.left);
    //     dfs(root.right);
    //     visit(root);
    // }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //postOrder(root, list);
        postOrderUseStack(root, list);
        return list;
    }

    void postOrderUseStack(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.pop();
            list.add(node.val);
            if (node.left != null) {
                deque.push(node.left);
            }
            if (node.right != null) {
                deque.push(node.right);
            }
        }
        Collections.reverse(list);
    }

    void postOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}
// @lc code=end

