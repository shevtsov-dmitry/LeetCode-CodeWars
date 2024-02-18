    void main() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left =  new TreeNode(15);
        node.right.right = new TreeNode(7);

        maxDepth(node);
    }

    public int maxDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftHeight = maxDepth(node.left);
        int rightHeight = maxDepth(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
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


