import java.awt.*;

void main(String[] args) {
    ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    node = recurBackwards(node);
    print(node);
}

public ListNode recurBackwards(ListNode node) {
    ListNode curr = node;
    ListNode prev = null;
    while (curr != null) {
        ListNode next = curr.next;
        node.next = prev;
        prev = curr;
        curr = next;
    }
    return node;
}

private static void print(ListNode node) {
    StringBuilder sb = new StringBuilder();
    while (node != null) {
        sb.append(node.val).append("-");
        node = node.next;
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.println("node = " + sb);
}

public final static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
