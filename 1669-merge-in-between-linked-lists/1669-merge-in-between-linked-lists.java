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

    public int Length1(ListNode list1) {
        int L = 0;
        while (list1 != null) {
            L++;
            list1 = list1.next;
        }
        return L;
    }

    public int Length2(ListNode list2) {
        int M = 0;
        while (list2 != null) {
            M++;
            list2 = list2.next;
        }
        return M;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int n = Length1(list1);
        int m = Length2(list2);

        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int k = 0;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null) {
            arr1[k] = temp1.val;
            k++;
            temp1 = temp1.next;
        }

        k = 0;

        while (temp2 != null) {
            arr2[k] = temp2.val;
            k++;
            temp2 = temp2.next;
        }

        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            li.add(arr1[i]);
        }
        
        for(int i = 0; i<m; i++){
            li.add(arr2[i]);
        }

        for(int i = b+1; i<n; i++){
            li.add(arr1[i]);
        }

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for(int x : li){
            ans.next = new ListNode(x);
            ans = ans.next;
        }

        return dummy.next;
    }
}