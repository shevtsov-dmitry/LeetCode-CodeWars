package leet_code.java;

public class MaximumDepthofBinaryTree104 {

    public static void main(String[] args) {
//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left =  new TreeNode(15);
//        node.right.right = new TreeNode(7);

        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        maxDepth(node);
    }

    public static int maxTimes = 0;
    public static int rememberOldTimes = 0;
    public static int maxDepth(TreeNode root) {
        int times = 0;
        traverse(root, times);
        System.out.println("maxTimes = " + maxTimes);
        return maxTimes;
    }

    static void traverse(TreeNode node, int times){
        if(node == null) return;
        times++;
        if(node.left == null && node.right == null) {
            maxTimes = Math.max(rememberOldTimes, times);
            System.out.println("node value = " + node.val);
            rememberOldTimes = times;
            return;
        }
        traverse(node.left, times);
        traverse(node.right, times);


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



