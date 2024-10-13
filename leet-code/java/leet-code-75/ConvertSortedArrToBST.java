void main() {

}

public TreeNode sortedArrayToBST(int[] nums) {
    return createTree(nums, 0, nums.length - 1);
}

TreeNode createTree(int[] nums, int left, int right) {

    if(right < left) {
        return null;
    }
    int mid = left + (right - left) / 2;
    TreeNode treeNode = new TreeNode(nums[mid]);
    treeNode.right = createTree(nums, mid + 1, right);
    treeNode.left = createTree(nums, left, right - 1);
    return treeNode;
}


public class TreeNode {
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