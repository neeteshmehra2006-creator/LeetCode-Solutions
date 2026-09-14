/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int Length1(ListNode head) {
        ListNode temp = head;
        int L = 0;

        while (temp != null) {
            L++;
            temp = temp.next;
        }

        return L;
    }

    public int Length2(ListNode head) {
        ListNode temp = head;
        int L = 0;

        while (temp != null) {
            L++;
            temp = temp.next;
        }

        return L;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int n = Length1(headA);
        int m = Length2(headB);

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        // Longer list ko aage move karo
        if (n > m) {
            for (int i = 0; i < n - m; i++) {
                temp1 = temp1.next;
            }
        } 
        else {
            for (int i = 0; i < m - n; i++) {
                temp2 = temp2.next;
            }
        }

        // Actual nodes compare karo
        while (temp1 != null && temp2 != null) {

            if (temp1 == temp2) {
                return temp1;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}