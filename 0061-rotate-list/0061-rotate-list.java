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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }
        
        int n = Length(head);
        ListNode temp = head;
        int j = 0;
        k = k % n;
        int arr[] = new int[n];

        while (temp != null) {
            arr[j] = temp.val;
            j++;
            temp = temp.next;
        }

        int res[] = new int[n];
        int p = 0;
        for (int i = n-k; i < n; i++) {
            res[p] = arr[i];
            p++;
        }

        for (int i = 0; i < n - k; i++) {
            res[p] = arr[i];
            p++;
        }

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for(int i = 0; i<n; i++){
            ans.next = new ListNode(res[i]);
            ans = ans.next;
        }
        return dummy.next;
    }
}