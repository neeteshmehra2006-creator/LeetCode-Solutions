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

    public ListNode removeNodes(ListNode head) {

        int n = Length(head);

        int arr[] = new int[n];
        int k = 0;

        ListNode temp = head;

        while (temp != null) {
            arr[k] = temp.val;
            k++;
            temp = temp.next;
        }

        int max = arr[n - 1];

        ArrayList<Integer> li = new ArrayList<>();
        li.add(max);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                li.add(arr[i]);
                max = arr[i];
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for (int i = li.size() - 1; i >= 0; i--) {
            ans.next = new ListNode(li.get(i));
            ans = ans.next;
        }

        return dummy.next;
    }
}