package linkedlist.removenthnodefromendoflist;

import pojo.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode ans = new ListNode(0,head);

        ListNode p1 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }

        ListNode p2 = ans;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return ans.next;
    }
}