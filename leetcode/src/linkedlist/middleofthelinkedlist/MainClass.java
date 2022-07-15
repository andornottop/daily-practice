package linkedlist.middleofthelinkedlist;

import pojo.ListNode;

import static utils.LinkedListUtils.listNodeToString;
import static utils.LinkedListUtils.stringToListNode;

public class MainClass {

    public static void main(String[] args) {

        ListNode head = stringToListNode("");

        ListNode ret = new Solution().middleNode(head);

        String out = listNodeToString(ret);

        System.out.print(out);
    }
}