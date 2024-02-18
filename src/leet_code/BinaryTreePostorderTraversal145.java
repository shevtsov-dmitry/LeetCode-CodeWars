package leet_code;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreePostorderTraversal145
 */

void main() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.right = new TreeNode(2);
    treeNode.right.left = new TreeNode(3);
    postorderTraversal(treeNode);
  }

   List<Integer> postorderTraversal(TreeNode node) {
    List<Integer> list = new ArrayList<>();
    traverse(node, list);
    System.out.println(list);
    return list;
  }

   void traverse(TreeNode node, List<Integer> list) {
    if (node != null) {
      traverse(node.left, list);
      traverse(node.right, list);
      list.add(node.val);
    }
  }

   class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

