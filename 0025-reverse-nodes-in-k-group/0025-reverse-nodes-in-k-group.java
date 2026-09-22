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

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = Length(head);
        ListNode temp = head;

        int arr[] = new int[n];
        int j = 0;

        while (temp != null) {
            arr[j] = temp.val;
            j++;
            temp = temp.next;
        }

        for (int i = 0; i + k <= n; i = i + k) {
            int low = i;
            int high = i + k - 1;

            while (low < high) {
                int t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
                low++;
                high--;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for (int i = 0; i < arr.length; i++) {
            ans.next = new ListNode(arr[i]);
            ans = ans.next;
        }
        return dummy.next;
    }
}