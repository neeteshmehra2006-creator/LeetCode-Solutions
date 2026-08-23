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

    public int Length(ListNode head){
        int L = 0;
        while(head != null){
            L++;
            head = head.next;
        }
        return L;
    }

    public ListNode mergeNodes(ListNode head) {
        int n = Length(head);

        int arr[] = new int[n];
        int k = 0;

        while (head != null) {
            arr[k] = head.val;
            k++;
            head = head.next;
        }

        int sum = 0;
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            sum = sum + arr[i];

            if (arr[i] == 0) {
                li.add(sum);
                sum = 0;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for (int x : li) {
            ans.next = new ListNode(x);
            ans = ans.next;
        }
        return dummy.next;
    }
}