/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 *
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/description/
 *
 * algorithms
 * Medium (64.71%)
 * Likes:    470
 * Dislikes: 0
 * Total Accepted:    92.3K
 * Total Submissions: 141.8K
 * Testcase Example:  '[1,2,3,4]'
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * 
 * 
 * 
 * 示例:
 * 
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode preNode = root;
        while (preNode.next != null && preNode.next.next != null) {
            ListNode l1 = preNode.next;
            ListNode l2 = preNode.next.next;
            ListNode next = l2.next;
            l1.next = next;
            l2.next = l1;
            preNode.next = l2;
            preNode = l1;
        }
        return root.next;
    }
}
// @lc code=end

