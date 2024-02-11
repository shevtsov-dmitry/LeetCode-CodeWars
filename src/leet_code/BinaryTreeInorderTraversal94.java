package leet_code.java;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreeInorderTraversal94
 */
public class BinaryTreeInorderTraversal94 {
  public static void main(String[] args) {
    TreeNode node = new TreeNode();
    node.val = 1;
    node.right = new TreeNode(2);
    node.right.left = new TreeNode(3);
    inorderTraversal(node);
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    traverse(root, list);
    System.out.println(list);
    return list;

  }

  public static void traverse(TreeNode node, List<Integer> list) {
    if (node != null) {
      traverse(node.left, list);
      list.add(node.val);
      traverse(node.right, list);
    }
  }

  static class TreeNode {
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
}
