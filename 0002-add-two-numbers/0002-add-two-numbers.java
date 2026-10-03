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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        while (l1 != null) {
            a.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            b.add(l2.val);
            l2 = l2.next;
        }

        Collections.reverse(a);
        Collections.reverse(b);

        String s1 = "";
        String s2 = "";

        while (a.size() != 0) {
            s1 += a.remove(0);
        }

        while (b.size() != 0) {
            s2 += b.remove(0);
        }

        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);

        BigInteger sum = n1.add(n2);

        String s = sum.toString();

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int i = s.length() - 1; i >= 0; i--) {
            temp.next = new ListNode(s.charAt(i) - '0');
            temp = temp.next;
        }

        return dummy.next;
    }
}