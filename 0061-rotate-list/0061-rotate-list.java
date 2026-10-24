/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
          return head;
        }
        ListNode head1 = head;
        ListNode slow = head;
        ListNode fast = head;

        int len = 0;

        while (head1 != null) {
            len++;
            head1 = head1.next;
        }

        k = k % len;
        head1 = head;

        if (k == 0)
            return head;

        for (int i = 0; i < len - k; i++) {
            fast = fast.next;
        }

        ListNode temp = fast;

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        while (fast != null) {
            res.next = new ListNode(fast.val);
            res = res.next;
            fast = fast.next;
        }

        while (head1 != temp) {
            res.next = new ListNode(head1.val);
            head1 = head1.next;
            res = res.next;
        }
        return dummy.next;
    }
}