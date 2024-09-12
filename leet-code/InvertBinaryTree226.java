import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//    Input: root = [4,2,7,1,3,6,9]
List<Integer> list = new ArrayList<>();
        int idx = -1;

        void main() {
//        TreeNode node = new TreeNode(4);
//        node.left = new TreeNode(2);
//        node.right = new TreeNode(7);
//        node.left.left = new TreeNode(1);
//        node.left.right = new TreeNode(3);
//        node.right.left = new TreeNode(6);
//        node.right.right = new TreeNode(9);

            TreeNode node = new TreeNode(2);
            node.left = new TreeNode(1);
            node.right = new TreeNode(3);

            traverse(node);
            System.out.println("old list = " + list);
            Collections.reverse(list);
            setValues(node);

            list.clear();
            traverse(node);

            System.out.println("new list = " + list);
        }

        void setValues(TreeNode node) {
            if (node == null) return;
            setValues(node.left);
            idx++;
            node.val = list.get(idx);
//        System.out.println("node.val = " + node.val);
            setValues(node.right);
        }

        void traverse(TreeNode node) {
            if (node == null) return;
            traverse(node.left);
            list.add(node.val);
            System.out.println("node = " + node);
            traverse(node.right);
        }

        TreeNode invertTree(TreeNode node) {
            traverse(node);
            Collections.reverse(list);
            list.clear();
            setValues(node);
            return node;
        }

        class TreeNode {
            TreeNode left;
            TreeNode right;
            int val;

            public TreeNode(int val) {
                this.val = val;
            }
        }
