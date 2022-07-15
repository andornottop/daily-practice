package binarytree.diameterofbinarytree;

import pojo.TreeNode;

import static utils.BinaryTreeUtils.stringToTreeNode;

public class MainClass {


    public static void main(String[] args) {
        TreeNode root = stringToTreeNode("[1,2,3,4,5]");

        int ret = new Solution().diameterOfBinaryTree(root);

        String out = String.valueOf(ret);

        System.out.print(out);
    }

}