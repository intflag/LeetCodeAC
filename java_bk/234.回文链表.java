/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 *
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 *
 * algorithms
 * Easy (41.37%)
 * Likes:    465
 * Dislikes: 0
 * Total Accepted:    79.1K
 * Total Submissions: 191.1K
 * Testcase Example:  '[1,2]'
 *
 * 请判断一个链表是否为回文链表。
 * 
 * 示例 1:
 * 
 * 输入: 1->2
 * 输出: false
 * 
 * 示例 2:
 * 
 * 输入: 1->2->2->1
 * 输出: true
 * 
 * 
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
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

    //使用了额外的空间，保存了反转后的链表，然后与反转前的比较
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode root = head;
        ListNode reverseNode = new ListNode(-1);
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = reverseNode.next;
            reverseNode.next = node;
            head = head.next;
        }
        while (root != null && reverseNode.next != null) {
            if (root.val != reverseNode.next.val) {
                return false;
            }
            root = root.next;
            reverseNode.next = reverseNode.next.next;
        }
        return true;
    }
}
// @lc code=end

