package linkedlist.mergetwosortedlists;

import pojo.ListNode;

class Solution {

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoListsRecursion(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursion(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursion(list1, list2.next);
            return list2;
        }
    }

    public ListNode mergeTwoListsIteration(ListNode list1,ListNode list2){
        ListNode sentry = new ListNode(-1);

        ListNode p = sentry;
        while(list1 != null && list2 != null){
            if (list1.val<list2.val){
                p.next = list1;
                list1 =  list1.next;
            } else {
                p.next = list2;
                list2 =  list2.next;
            }
            p = p.next;
        }
        if (list1 == null){
            p.next = list2;
        }
        if (list2 == null){
            p.next = list1;
        }
        return sentry.next;
    }
}