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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        int n = Length(head); 

        ListNode temp = head;
        int arr[] = new int[n];
        int k = 0;

        while(temp != null){
            arr[k] = temp.val;
            k++;
            temp = temp.next;
        } 

        int low = 0;
        int high = n - 1;

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
 
        while(low < high){
            res.next = new ListNode(arr[low]);
            res = res.next;
            res.next = new ListNode(arr[high]);
            res = res.next;
            low++;
            high--;
        }
        if (low == high) {
            res.next = new ListNode(arr[low]);
            res = res.next;
        }
 
        ListNode newHead = dummy.next;
        ListNode curr = head;

        while (newHead != null) {
            curr.val = newHead.val;
            curr = curr.next;
            newHead = newHead.next;
        }
    }
}