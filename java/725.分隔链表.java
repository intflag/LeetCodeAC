/*
 * @lc app=leetcode.cn id=725 lang=java
 *
 * [725] 分隔链表
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        ListNode head = root;
        while (head != null) {
            len++;
            head = head.next;
        }
        int groupCnt = len < k ? 1 : len / k;
        int yu = len < k ? 0 :len % k;
        ListNode[] res = new ListNode[k];
        int index = 0;
        ListNode p = null;
        int cnt = 0;
        while (root != null) {
            if (cnt < groupCnt) {
                if (res[index] == null) {
                    res[index] = new ListNode(root.val);
                    p = res[index];
                } else {
                    ListNode node = new ListNode(root.val);
                    p.next = node;
                    p = node;
                }
                cnt++;
                root = root.next;
            } else if (cnt == groupCnt && yu > 0) {
                p.next = new ListNode(root.val);
                root = root.next;
                cnt++;
                yu--;
            } else {
                index++;
                cnt = 0;
            }

        }
        return res;
    }
}
// @lc code=end

