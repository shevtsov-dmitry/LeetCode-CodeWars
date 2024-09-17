import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

void main() {
//    TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
//    TreeNode node2 = new TreeNode(1, null, new TreeNode(2));
    TreeNode node1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode node2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    boolean sameTree = isSameTree(node1, node2);
    System.out.println("result: " + sameTree);
    System.out.println("-------------------");
    System.out.println(values1tree);
    System.out.println(stringJoiner);
}

public  List<Integer> values1tree = new ArrayList<>(100);
public  int index = 0;
void traverseWithNulls(TreeNode node) {
    if (node == null) {
        values1tree.add(-1);
    } else {
        values1tree.add(node.val);
        traverseWithNulls(node.left);
        traverseWithNulls(node.right);
    }
}

 StringJoiner stringJoiner  = new StringJoiner(", ", "[", "]");
public  boolean areTreesMatch(TreeNode node) {
    if (node == null) {
        stringJoiner.add(String.valueOf(-1));
        if (values1tree.get(index) != -1) return false;
        index++;
    } else {
        stringJoiner.add(String.valueOf(node.val));
        if(values1tree.get(index) != node.val) return false;
        index++;
        areTreesMatch(node.left);
        areTreesMatch(node.right);
    }
    return true;
}

public boolean isSameTree(TreeNode p, TreeNode q) {
    traverseWithNulls(p);
    if (values1tree.isEmpty()) return false;
    return areTreesMatch(q);
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
