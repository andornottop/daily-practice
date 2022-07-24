package linkedlist.linkedlistcycleii;

import pojo.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode quick = head;
        ListNode slow = head;

        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow) {
                ListNode p = head;
                while (p != slow) {
                    p = p.next;
                    slow = slow.next;
                }
                return p;
            }
        }
        return null;
    }
}