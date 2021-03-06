package linkedlist.mergetwosortedlists;

import pojo.ListNode;

import static utils.LinkedListUtils.listNodeToString;
import static utils.LinkedListUtils.stringToListNode;

public class MainClass {

    public static void main(String[] args) {

        ListNode list1 = stringToListNode("[1,2]");
        ListNode list2 = stringToListNode("[3,4]");

        ListNode ret = new Solution().mergeTwoListsIteration(list1, list2);

        String out = listNodeToString(ret);

        System.out.print(out);

    }
}