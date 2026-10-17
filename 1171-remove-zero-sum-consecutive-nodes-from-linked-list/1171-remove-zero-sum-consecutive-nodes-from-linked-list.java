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
import java.util.*;

class Solution {

    public int Length(ListNode head) {
        int L = 0;
        while (head != null) {
            L++;
            head = head.next;
        }
        return L;
    }

    public ListNode removeZeroSumSublists(ListNode head) {

        int n = Length(head);
        int arr[] = new int[n];

        ListNode temp = head;
        int j = 0;

        while (temp != null) {
            arr[j++] = temp.val;
            temp = temp.next;
        }

        ArrayList<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int sum = 0;
        st.push(0);

        for (int x : arr) {
            sum = sum + x;

            if (st.contains(sum)) {
                while (st.peek() != sum) {
                    st.pop();
                    li.remove(li.size() - 1);
                }
            } else {
                st.push(sum);
                li.add(x);
            }
        }

        ListNode dummy = new ListNode(0);
        temp = dummy;

        for (int x : li) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }

        return dummy.next;
    }
}