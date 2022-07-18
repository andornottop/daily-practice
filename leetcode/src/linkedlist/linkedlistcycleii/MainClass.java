package linkedlist.linkedlistcycleii;

import pojo.ListNode;

import static utils.LinkedListUtils.*;

public class MainClass {

    public static void main(String[] args) {

        ListNode head = stringToListNode("[3,2,0,-4]");

        ListNode ret = new Solution().detectCycle(head);

        String out = listNodeToString(ret);

        System.out.print(out);
    }
}