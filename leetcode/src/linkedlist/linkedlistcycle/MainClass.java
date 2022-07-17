package linkedlist.linkedlistcycle;

import pojo.ListNode;

import static utils.LinkedListUtils.booleanToString;
import static utils.LinkedListUtils.stringToListNode;

public class MainClass {

    public static void main(String[] args) {

        ListNode head = stringToListNode("[3,2,0,-4]");

        boolean ret = new Solution().hasCycle(head);

        String out = booleanToString(ret);

        System.out.print(out);
    }
}