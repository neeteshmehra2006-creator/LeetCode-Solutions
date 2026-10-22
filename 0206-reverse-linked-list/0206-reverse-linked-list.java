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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        while (st.size() != 0) {
            res.next = new ListNode(st.pop());
            res = res.next;
        }
        return dummy.next;
    }
}