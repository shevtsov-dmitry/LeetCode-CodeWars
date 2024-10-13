void main() {}

boolean isSameTree(Node one, Node two){
    // finish traversal without any differences
    if(one == null && two == null) {
        return true;
    }

    // if there is any difference in trees
    if(one == null || two == null || one.val != two.val) {
        return false;
    }

    // continue comparing two trees
    return isSameTree(one.left, two.left) && isSameTree(one.right, two.right);
}

class Node  {
    Node left;
    Node right;
    int val;
    Node() {

    }
    Node(int val) {

    }
}
