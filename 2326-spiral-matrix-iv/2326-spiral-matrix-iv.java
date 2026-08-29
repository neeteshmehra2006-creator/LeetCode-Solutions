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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int arr[][] = new int[m][n];

           for(int i = 0; i < m; i++) {
            Arrays.fill(arr[i], -1);
        }
        int o = 0;
        int p = 0;

        int top = 0;
        int bottom = m - 1;
        int right = n - 1;
        int left = 0;

        ListNode temp = head;

        while (temp != null && left <= right && top <= bottom) {

            for (int i = left; i <= right && temp != null; i++) {
                arr[top][i] = temp.val;
                temp = temp.next;
            }
            top++;

            for (int i = top; i <= bottom && temp != null; i++) {
                arr[i][right] = temp.val;
                temp = temp.next;
            }
            right--;

            if (top <= bottom) {

                for (int i = right; i >= left && temp != null; i--) {
                    arr[bottom][i] = temp.val;
                    temp = temp.next;
                }
                bottom--;
            }
            if (left <= right) {

                for (int i = bottom; i >= top && temp != null; i--) {
                    arr[i][left] = temp.val;
                    temp = temp.next;
                }
                left++;
            }
        }
        return arr;
    }
}