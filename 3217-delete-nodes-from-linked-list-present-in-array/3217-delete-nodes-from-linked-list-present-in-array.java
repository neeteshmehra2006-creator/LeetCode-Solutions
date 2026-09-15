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

    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        ListNode temp = head;

        while (temp != null) {
            if (!set.contains(temp.val)) {
                ans.next = new ListNode(temp.val);
                ans = ans.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}