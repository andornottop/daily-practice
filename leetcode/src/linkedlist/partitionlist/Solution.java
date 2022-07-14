package linkedlist.partitionlist;

import pojo.ListNode;

class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);

        ListNode smallPointer = small;
        ListNode bigPointer = big;
        while (head != null) {
            if (head.val < x) {
                smallPointer.next = head;
                smallPointer = smallPointer.next;
            } else {
                bigPointer.next = head;
                bigPointer = bigPointer.next;
            }
            head = head.next;
        }
        bigPointer.next = null;
        smallPointer.next = big.next;
        return small.next;
    }
}