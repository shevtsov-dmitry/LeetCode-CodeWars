void main() {
    TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20));
    node.right.left = new TreeNode(15);
    node.right.right = new TreeNode(7);

    traverseLeftLeaves(node, false);
}

int sum = 0;
// Utility function to recursively print left leaf nodes
void traverseLeftLeaves(TreeNode node, boolean isLeft) {
    if (node == null)
        return;

    // If the node is a leaf and it's a left node, print its value
    if (node.left == null && node.right == null && isLeft) {
        sum+= node.val;
        return;
    }

    // Recur for left and right subtrees
    traverseLeftLeaves(node.left, true);
    traverseLeftLeaves(node.right, false);
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