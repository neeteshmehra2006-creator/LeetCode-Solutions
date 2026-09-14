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
    public int Length(ListNode head) {

        int L = 0;
        while (head != null) {
            L++;
            head = head.next;
        }
        return L;
    }

    public ListNode swapNodes(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;
        int n = Length(head);
     
        for (int i = 1; i < k; i++) {
            slow = slow.next;
        }

        int P = n - k + 1;

        for (int i = 1; i < P; i++) {
            fast = fast.next;
        }
 
        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;

        return head;
    }
}