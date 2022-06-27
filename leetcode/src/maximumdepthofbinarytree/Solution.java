package maximumdepthofbinarytree;

import pojo.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        // 前序遍历
       int leftMaxDepth =  maxDepth(root.left);
        // 中序遍历
        int rightMaxDepth =  maxDepth(root.right);
        // 后序遍历
        return Math.max(leftMaxDepth,rightMaxDepth) + 1;
    }
}