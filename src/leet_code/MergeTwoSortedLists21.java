package leet_code.java;

import java.util.*;

import sun.awt.resources.awt;

public class MergeTwoSortedLists21 {
  public static void main(String[] args) {
    var head1 = new ListNode(1, new ListNode(5, new ListNode(8, new ListNode(222))));
    var head2 = new ListNode(0, new ListNode(5,
        new ListNode(10, new ListNode(13, new ListNode(2, new ListNode(3, new ListNode(100, new ListNode(99))))))));
    ListNode head3 = mergeTwoLists(head1, head2);
    print(head3);
  }

  private static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
    if (head1 == null)
      return head2;
    if (head2 == null)
      return head1;
    if (head1.val <= head2.val) {
      head1.next = mergeTwoLists(head1.next, head2);
      return head1;
    } else {
      head2.next = mergeTwoLists(head1, head2.next);
      return head2;
    }
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

}

class ListNode {
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
