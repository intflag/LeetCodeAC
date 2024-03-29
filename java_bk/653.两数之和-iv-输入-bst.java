/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
 *
 * https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/description/
 *
 * algorithms
 * Easy (54.21%)
 * Likes:    120
 * Dislikes: 0
 * Total Accepted:    13.1K
 * Total Submissions: 24.1K
 * Testcase Example:  '[5,3,6,2,4,null,7]\n9'
 *
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 * 
 * 案例 1:
 * 
 * 
 * 输入: 
 * ⁠   5
 * ⁠  / \
 * ⁠ 3   6
 * ⁠/ \   \
 * 2   4   7
 * 
 * Target = 9
 * 
 * 输出: True
 * 
 * 
 * 
 * 
 * 案例 2:
 * 
 * 
 * 输入: 
 * ⁠   5
 * ⁠  / \
 * ⁠ 3   6
 * ⁠/ \   \
 * 2   4   7
 * 
 * Target = 28
 * 
 * 输出: False
 * 
 * 
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
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> numList = new ArrayList<>();
        inOrder(root, numList);
        int i = 0;
        int j = numList.size() - 1;
        while (i < j) {
            int sum = numList.get(i) + numList.get(j);
            if (sum > k) {
                j--;
            } else if (sum < k) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public void inOrder(TreeNode root, List<Integer> numList) {
        if (root == null) return;
        inOrder(root.left, numList);
        numList.add(root.val);
        inOrder(root.right, numList);
    }
}
// @lc code=end

