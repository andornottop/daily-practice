package linkedlist.middleofthelinkedlist;

import pojo.ListNode;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;

        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
        }
        return slow;
    }
}