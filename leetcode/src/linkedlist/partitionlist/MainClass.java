package linkedlist.partitionlist;

import pojo.ListNode;

import static utils.LinkedListUtils.listNodeToString;
import static utils.LinkedListUtils.stringToListNode;


public class MainClass {

    public static void main(String[] args) {

        String line = "[1,4,3,2,5,2]";

        ListNode head = stringToListNode(line);

        int x = 3;

        ListNode ret = new Solution().partition(head, x);

        String out = listNodeToString(ret);

        System.out.print(out);

    }
}