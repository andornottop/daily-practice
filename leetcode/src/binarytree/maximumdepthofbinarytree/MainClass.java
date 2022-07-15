package binarytree.maximumdepthofbinarytree;

import pojo.TreeNode;

import static utils.BinaryTreeUtils.stringToTreeNode;

public class MainClass {

    public static void main(String[] args) {

        TreeNode root = stringToTreeNode("[3,9,20,null,null,15,7]");

        int ret = new Solution().maxDepth(root);

        String out = String.valueOf(ret);

        System.out.print(out);

    }
}