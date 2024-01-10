package leet_code.java;

public class ReverseLinkedList206 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        node = reverseNodeIteratevely(node);
        print(node);
    }

    private static ListNode reverseNodeIteratevely(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode tempo = current.next;
            current.next = previous;
            previous = current;
            current = tempo;

        }
        return previous;
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
