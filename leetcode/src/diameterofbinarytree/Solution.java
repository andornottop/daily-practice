package diameterofbinarytree;

import pojo.TreeNode;

class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return diameter;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);

        diameter = Math.max(diameter, leftMaxDepth + rightMaxDepth);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }

}