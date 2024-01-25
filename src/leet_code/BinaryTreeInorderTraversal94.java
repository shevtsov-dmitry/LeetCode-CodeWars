package leet_code.java;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
//        Node node = new Node(1);
//        node.right = new Node(2);
//        node.right.left = new Node(3);
        Node node = new Node(1);
        node.right = new Node(3);
        node.right.right = new Node(6);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        var list = inorderTraversal(node);
        System.out.println("list = " + list);
    }

    private static List<Integer> inorderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        traverse(node, result);
        return result;
    }

    //    Output: [1,3,2]
    private static void traverse(Node node, List<Integer> list) {
//        if(node.left == null && node.right == null) return;
        if(node == null) return;
        traverse(node.left, list);
        list.add(node.val);
        traverse(node.right, list);
    }


    static class Node {
        Node right;
        Node left;
        int val;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
