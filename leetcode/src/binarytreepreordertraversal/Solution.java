package binarytreepreordertraversal;

import pojo.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }

    public void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        // 前序遍历
        traverse(root.left, list);
        // 中序遍历
        traverse(root.right, list);
        // 后序遍历
    }
}