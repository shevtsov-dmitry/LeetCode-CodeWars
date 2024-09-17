import java.util.StringJoiner;

void main() {
    int[] arr = {-10, -3, 0, 5, 9};
    var tree = sortedArrayToBST(arr);
    System.out.println(stringJoiner.add("node"));
    traverse(tree);
}

public TreeNode sortedArrayToBST(int[] nums) {
    return createTree(0, nums.length - 1, nums);
}

TreeNode createTree(int left, int right, int[] arr) {
    if (left > right) {
        return null;
    }
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(arr[mid]);
    node.left = createTree(left, mid - 1, arr);
    node.right = createTree(mid + 1, right, arr);
    return node;
}

StringJoiner stringJoiner = new StringJoiner(", ");

void traverse(TreeNode node) {
    if (node != null) {
        traverse(node.left);
        stringJoiner.add(String.valueOf(node.val));
        traverse(node.right);

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
