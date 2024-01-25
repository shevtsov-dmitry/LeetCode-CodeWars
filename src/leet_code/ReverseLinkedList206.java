package leet_code.java;

public class ReverseLinkedList206 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        node = recur(node, null);
        print(node);
    }

    private static ListNode recur(ListNode current, ListNode reversed) {
        if (current == null) {
            return reversed;
        }
        ListNode tempo = current.next;
        current.next = reversed;
        return recur(tempo, current);
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
}
