/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
 *
 * https://leetcode-cn.com/problems/add-two-numbers-ii/description/
 *
 * algorithms
 * Medium (56.72%)
 * Likes:    176
 * Dislikes: 0
 * Total Accepted:    28.9K
 * Total Submissions: 51K
 * Testcase Example:  '[7,2,4,3]\n[5,6,4]'
 *
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 
 * 
 * 
 * 进阶：
 * 
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stackA = buildStack(l1);
        Stack<Integer> stackB = buildStack(l2);
        ListNode head = new ListNode(-1);
        int tmp = 0;
        while (!stackA.isEmpty() || !stackB.isEmpty() || tmp != 0) {
            int x = stackA.isEmpty() ? 0 : stackA.pop();
            int y = stackB.isEmpty() ? 0 : stackB.pop();
            int sum = x + y + tmp;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            tmp = sum / 10;
        }
        return head.next;
    }

    public Stack<Integer> buildStack(ListNode node) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        return stack;
    }
}
// @lc code=end

