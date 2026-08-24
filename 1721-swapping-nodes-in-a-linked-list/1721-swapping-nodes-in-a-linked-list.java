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

        int n = Length(head);

        int j = 0;
        int arr[] = new int[n];
        ListNode temp = head;

        while (temp != null) {
            arr[j] = temp.val;
            j++;
            temp = temp.next;
        }

        int low = k - 1;
        int high = n - k;

        int tem = arr[low];
        arr[low] = arr[high];
        arr[high] = tem;

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for (int i = 0; i < n; i++) {
            ans.next = new ListNode(arr[i]);
            ans = ans.next;
        }
        return dummy.next;
    }
}