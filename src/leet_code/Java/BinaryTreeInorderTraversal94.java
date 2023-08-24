package leet_code.Java;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
//        TreeNode node = new TreeNode(1);
//        node.right = new TreeNode(2);
//        node.right.left = new TreeNode(3);
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(6);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        var list = inorderTraversal(node);
        System.out.println("list = " + list);
    }

    private static List<Integer> inorderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        traverse(node, result);
        return result;
    }

    //    Output: [1,3,2]
    private static void traverse(TreeNode node, List<Integer> list) {
//        if(node.left == null && node.right == null) return;
        if(node == null) return;
        traverse(node.left, list);
        list.add(node.val);
        traverse(node.right, list);
    }


    static class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
