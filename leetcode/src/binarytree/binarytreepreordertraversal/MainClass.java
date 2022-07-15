package binarytree.binarytreepreordertraversal;

import pojo.TreeNode;

import java.util.List;

import static utils.BinaryTreeUtils.integerArrayListToString;
import static utils.BinaryTreeUtils.stringToTreeNode;

public class MainClass {

    public static void main(String[] args) {
        TreeNode root = stringToTreeNode("[3,9,20,null,null,15,7]");

        List<Integer> ret = new Solution().preorderTraversal(root);

        String out = integerArrayListToString(ret);

        System.out.print(out);
    }
}