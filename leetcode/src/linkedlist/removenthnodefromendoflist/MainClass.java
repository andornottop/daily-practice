package linkedlist.removenthnodefromendoflist;

import pojo.ListNode;

import static utils.LinkedListUtils.listNodeToString;
import static utils.LinkedListUtils.stringToListNode;

public class MainClass {

    public static void main(String[] args) {

        ListNode head = stringToListNode("[1,2,3,4,5]");

        ListNode ret = new Solution().removeNthFromEnd(head, 3);

        String out = listNodeToString(ret);

        System.out.print(out);

    }
}