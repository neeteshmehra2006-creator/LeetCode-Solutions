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
        ListNode temp = head;
        int L = 0;

        while (temp != null) {
            L++;
            temp = temp.next;
        }
        return L;
    }

    public ListNode deleteMiddle(ListNode head) {

        int n = Length(head);
        int arr[] = new int[n];

        ListNode temp = head;
        int j = 0;

        while (temp != null) {
            arr[j] = temp.val;
            j++;
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        int target = n / 2;

        for (int i = 0; i < arr.length; i++) {
            if (i == target)
                continue;
            ans.next = new ListNode(arr[i]);
            ans = ans.next;
        }
        return dummy.next;
    }
}