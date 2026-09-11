class Solution {
    ListNode dummy = new ListNode(0);
    ListNode res = dummy;

    public void createNewLL(int d) {
        res.next = new ListNode(d);
        res = res.next;
    }

    public ListNode partition(ListNode head, int x) {

        ListNode temp = head;

       
        while (temp != null) {
            if (temp.val < x) {
                createNewLL(temp.val);
            }
            temp = temp.next;    
        }

       
        temp = head;

        while (temp != null) {
            if (temp.val >= x) {
                createNewLL(temp.val);
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}