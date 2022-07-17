package linkedlist.linkedlistcycle;

import pojo.ListNode;

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;

        while (quick != null && quick.next != null){
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow){
                return true;
            }
        }

        return false;
    }
}