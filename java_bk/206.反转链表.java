/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (68.01%)
 * Likes:    900
 * Dislikes: 0
 * Total Accepted:    212.7K
 * Total Submissions: 310.6K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 反转一个单链表。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
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

    //方法1 100 %, 5.06 %, 39.4 MB
    // public ListNode reverseList(ListNode head) {
    //     ListNode root = null;
    //     while (head != null) {
    //         ListNode node = new ListNode(head.val);
    //         node.next = root;
    //         root = node;
    //         head = head.next;
    //     }
    //     return root;
    // }

    //递归 100 %, 5.06 %, 39.8 MB
    // public ListNode reverseList(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode next = head.next;
    //     ListNode newHead = reverseList(next);
    //     next.next = head;
    //     head.next = null;
    //     return newHead;
    // }
    
    //头插法 100 %, 5.06 %, 39.6 MB
    // public ListNode reverseList(ListNode head) {
    //     ListNode root = new ListNode(-1);
    //     while (head != null) {
    //         ListNode next = head.next;
    //         head.next = root.next;
    //         root.next = head;
    //         head = next;
    //     }
    //     return root.next;
    // }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
// @lc code=end

