package leet_code.java;

import java.util.*;

public class MergeTwoSortedLists21 {
    public class ListNode {
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


    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        List<Integer> list = new ArrayList<>();
        fillList(list, h1, h2);
        Collections.sort(list);
        return createListNodeFilledWithArrayValues(list, 0, list.size()); //head of merged linked list;
    }

    public void fillList(List<Integer> list, ListNode h1, ListNode h2) {
        gatherNodeValues(list, h1);
        gatherNodeValues(list, h2);
    }

    public static void gatherNodeValues(List<Integer> list, ListNode h1) {
        while(h1 != null) {
            list.add(h1.val);
            h1 = h1.next;
        }
    }

    public static ListNode createListNodeFilledWithArrayValues(List<Integer> nums, int index, int length) {
        if(index == length) {
            return null;
        }
        ListNode cur = new ListNode(nums.get(index));
        cur.next = createListNodeFilledWithArrayValues(nums, index + 1, length);
        return cur;
    }
}
